#1: Calculate √10 manually (using approximation).

# A good guess for √10​ is x0=3, since √3 = 9 and √4 = 16.
# Babylonian Method (iterative formula): xn + 1 = (xn + (S / xn) / 2).
# 'S' is the nuymber we want the square root. S = 10.
# Iteration (xo = 3): x1 = (x0 + (10/x0) / 2) = (3 + (10 / 3) / 2) = ((3 + 3,33333333) / 2) = (6,33333333 / 2) ≈ 3,16666667. You can continue iteration.
# I made several iterations and the value of x4 is identical to x3, up to 8 decimal places provided, showing that the method has already converged to the desired precision. This is because √10 is very close to 3, and additional iterations do not significantly change the result within this precision. Therefore, I can create the code.

def calculates_square_root(n, precision=0.0001):
    estimate = (n / 2.0)
    while True:
        next_estimate = ((estimate + (n / estimate)) / 2)
        if abs(next_estimate - estimate) < precision:
            return next_estimate
        else:
            estimate = next_estimate

sqrt_10 = calculates_square_root(10)
print(sqrt_10)
