# Math Chalenge: Rationalization of Expression with Square Root

**Objective**: Implement the calculation of the expression `(√10 + 3)/(√10 - 3)` by rationalizing the denominator **without using external libraries** like `math` (e.g. Python).

## Description

This challenge combines mathematical concepts and programming:
1. **Math**: Denominator rationalization using conjugates and algebraic identities
2. **Programming**: Manual implementation of square root calculation (Babylonian/Newton's method) and algebraic operations.

## Key Formula

`math
(√10 + 3)/(√10 - 3) = 19 + 6√10
`

## Requirements
- Pure code implementation (no `import math`)
- Calculate √10 with 4 decimal places precision
- Rationalize the expression by multiplying by the conjugate
- Verify the result matches `19 + 6√10`

## Tests

Your code must pass these checks:

    √10 ≈ 3.1623 (precision 0.0001)

    Rationalized denominator must equal exactly 1

    Final result ≈ 38.1623
