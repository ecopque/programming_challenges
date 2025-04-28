# Math Challenge: Rationalization of Expression with Square Root

This project implements a mathematical challenge to rationalize the expression (√10 + 3)/(√10 - 3). The idea to convert this calculation into Python code was inspired by using the ["1st - 12th Grade Math Problems" app](https://play.google.com/store/apps/details?id=com.companyname.MaturaMatematyka), which presented this problem along with multiple-choice options, one of which was the correct answer: 19 + 6√10.

## Objective

Implement the calculation of the expression (√10 + 3)/(√10 - 3) by rationalizing the denominator using pure Python code, without relying on external libraries.

## Core Mathematical Concepts

This challenge requires two key algebraic identities:

- **Difference of Squares**:  
  (a - b)(a + b) = a^2 - b^2  
  (Used to rationalize the denominator by eliminating the radical)

- **Square of a Sum**:  
  (a + b)^2 = a^2 + 2ab + b^2  
  (Used to expand the numerator after multiplying by the conjugate)

## Requirements

- Calculate √10 numerically using the Babylonian method with a precision of 0.0001.
- Rationalize the expression by multiplying the numerator and denominator by the conjugate of the denominator (√10 + 3).
- Deduce the exact form of the result as c + d√10, which should match 19 + 6√10.
- Show each step of the rationalization process, mirroring the manual calculation process.

## Tests

Your code must pass these checks:

- √10 ≈ 3.1622 (with a precision of 0.0001; the actual value may be slightly higher, e.g., 3.162277660168379).
- The rationalized denominator should be exactly 1 (though, due to floating-point errors, it may be very close, e.g., 1.0000000000000018).
- The numerical result of the expression should be ≈ 37.9737 (with 4 decimal places precision), which corresponds to the exact form 19 + 6√10.

## Why These Formulas?

- **Difference of Squares**: Eliminates radicals from the denominator, simplifying the expression.
- **Square of a Sum**: Properly expands the squared numerator term after multiplication by the conjugate.

## Resources

- **Algebraic Identities**: [GeeksforGeeks - Algebraic Identities](https://www.geeksforgeeks.org/algebraic-identities/)
- **Babylonian Method**: [Wikipedia - Methods of Computing Square Roots](https://en.wikipedia.org/wiki/Methods_of_computing_square_roots)

## Screenshots and Handwritten Calculations

Below are images that illustrate the process and inspiration behind this project:

- **Math Challenge App Screenshot**: The original problem as presented in the "1st - 12th Grade Math Problems" app, showing the expression and the multiple-choice options.  
  ![Math Challenge App Screenshot](https://github.com/ecopque/programming_challenges/blob/main/04_-_math_rationalization_of_expression_with_square_root/prints/IMG_app.jpeg)

- **Handwritten Calculations**: My step-by-step calculations for rationalizing the denominator, mirroring the process implemented in the code.  
  ![Handwritten Calculations](https://github.com/ecopque/programming_challenges/blob/main/04_-_math_rationalization_of_expression_with_square_root/prints/IMG_20250428_184421.jpg)

---

**Author**: Edson Copque - [Linktree](https://linktr.ee/edsoncopque)
  
---

**Author**: Edson Copque - [Linktree](https://linktr.ee/edsoncopque)
