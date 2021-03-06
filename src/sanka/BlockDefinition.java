package sanka;

import java.util.List;

import sanka.antlr4.SankaParser.BlockContext;
import sanka.antlr4.SankaParser.IfStatementContext;
import sanka.antlr4.SankaParser.StatementContext;

public class BlockDefinition {
    StatementDefinition[] block;
    SymbolTable.Frame frame;

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

    void evaluate(IfStatementContext ictx) {
        Environment env = Environment.getInstance();
        env.symbolTable.push(null);
        this.block = new StatementDefinition[1];
        this.block[0] = new StatementDefinition();
        this.block[0].evaluateIf(ictx);
        this.frame = env.symbolTable.pop();
    }

    void translate(boolean printBraces) {
        Environment env = Environment.getInstance();
        env.symbolTable.push(this.frame);
        if (printBraces) {
            env.print("{");
            env.level++;
        }
        for (StatementDefinition statementdef : this.block) {
            statementdef.translate();
        }
        if (printBraces) {
            env.level--;
            env.print("}");
        }
        env.symbolTable.pop();
    }
}
