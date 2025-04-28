# ORIGINAL EXPRESSION:  ((√10 + 3) / (√10 - 3))

# A good guess for √10​ is x0=3, since √3 = 9 and √4 = 16.
# Babylonian Method (iterative formula): xn + 1 = (xn + (S / xn) / 2).
# 'S' is the nuymber we want the square root. S = 10.
# Iteration (xo = 3): x1 = (x0 + (10/x0) / 2) = (3 + (10 / 3) / 2) = ((3 + 3,33333333) / 2) = (6,33333333 / 2) ≈ 3,16666667. You can continue iteration.
# I made several iterations and the value of x4 is identical to x3, up to 8 decimal places provided, showing that the method has already converged to the desired precision. This is because √10 is very close to 3, and additional iterations do not significantly change the result within this precision. Therefore, I can create the code.


# Step 1: Calculate sqrt(10) using the Babylonian method (already implemented):
def calculates_square_root(n, precision=0.0001):
    estimate = (n / 2.0)
    while True:
        next_estimate = ((estimate + (n / estimate)) / 2)
        if abs(next_estimate - estimate) < precision:
            return next_estimate
        else:
            estimate = next_estimate

# Calculate sqrt(10):
sqrt_10 = calculates_square_root(10)
print(f'Step 1: Calculate √10 numerically:')
print(f'√10 ≈ {sqrt_10}.')
print()


# Step 2: Define the original expression and the conjugate
numerator = (sqrt_10 + 3)
numerator_str = '√10 + 3'

denominator = (sqrt_10 - 3)
denominator_str = '√10 - 3'

conjugate = (sqrt_10 + 3)

print(f'Step 2: Define the expression and multiply by the conjugate of the denominator:')
print(f'Original expression ({numerator_str} / {denominator_str}): ({numerator}) / ({denominator}).')
print(f'Multiplying numerator and denominator by Conjugate: ({conjugate}).')
print()

#Step 3: Calculate the numerator using (a + b)^2 = (a^2 + 2ab + b^2)
print('Calculate the numerator using "Squade of Sum" = (a + b)^2 = (a^2 + 2ab + b^2): ')
print('(√10 + 3)(√10 + 3) = (√10)^2 + 2(√10)(3) + 3^2')
a = sqrt_10
b = 3
numerator_new = ((a + b) * (a + b))

term1 = (a * a) # (√10)^2
termi2 = (2 * a * b) # 2(√10)(3)
term3 = (b * b) # 3^2
numerator_expanded = (termi1 + term2 + term3)
