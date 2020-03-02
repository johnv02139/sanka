package sanka;

import java.util.List;

import sanka.MethodDefinition.BlockGenerator;
import sanka.antlr4.SankaParser.BlockContext;
import sanka.antlr4.SankaParser.IfStatementContext;
import sanka.antlr4.SankaParser.StatementContext;

public class BlockDefinition {
    public StatementDefinition[] block;
    public SymbolTable.Frame frame;

    void evaluate(BlockContext ctx) {
        Environment env = Environment.getInstance();
        env.symbolTable.push(null);
        List<StatementContext> statements = ctx.statement();
        this.block = new StatementDefinition[statements.size()];
        for (int idx = 0; idx < this.block.length; idx++) {
            this.block[idx] = new StatementDefinition();
            this.block[idx].evaluate(statements.get(idx));
        }
        this.frame = env.symbolTable.pop();
    }

    void evaluate(BlockGenerator generator) {
        Environment env = Environment.getInstance();
        env.symbolTable.push(null);
        this.block = generator.generate();
        this.frame = env.symbolTable.pop();
    }

    void evaluate(IfStatementContext ictx) {
        Environment env = Environment.getInstance();
        env.symbolTable.push(null);
        this.block = new StatementDefinition[1];
        this.block[0] = new StatementDefinition();
        this.block[0].evaluateIf(ictx);
        this.frame = env.symbolTable.pop();
    }
}
