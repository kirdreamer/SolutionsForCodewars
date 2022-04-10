Description
---
In this kata you're given 3 values: a: int, b: int, symbol: char

Your task is to return the max / min value of (a, b), depending on symbol:

If the symbol is > return the max value, if < return the min value. (you can assume inputs are valid)

Examples
---
solve(2, 1, '>') => 2

solve(2, 1, '<') => 1

So what's tricky?
---
Your code cannot contain any of the following char sequences: \u if ? . for while switch

This means you're not allowed to use conditionals ( if / ?: / switch / while / for ) or import or use any built in functions / tools.

Input range:

    −10000 < a,b < 10000
