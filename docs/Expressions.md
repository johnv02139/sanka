## Should Sanka allow variable assignment as an expression?

It's mildly convenient, but it's also scary, because nobody really
knows what it does. For example, consider the following code block,
which compiles in both C and Java:
~~~
    int x = 0;
    int z = x + (x=1) + (x=2);
~~~

What is the value of z?

It turns out that in Java, the value is 3. And in C, the value is 4.

Now, let's change the order of the terms. That shouldn't matter, since
addition is commutative, right?
~~~
    int x = 0;
    int z = (x=1) + (x=2) + x;
~~~

Now, in Java, the value is 5. And in C, the value is 6.

One set of terms. Two languages. Four different values.

What should the value be in Sanka?

Answer: Sanka Language Specification 1.0 does not allow variable
assignment as an expression. We defer this question to version 1.1.
