
# the fibonacci sequence is a famous bit of mathematics, and it happens to have a recursive definition
# the first two values in the sequence are 0 and 1 (essentially 2 base cases)
# each subsequent value is the sum of the previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13, 21 and so on
# define a recursive fibonacci(n) method that returns the nth fibonacci number, with n=0 representing the start of the sequence
def fibonacci(n):
    if n == 0:
        return 0
    if n == 1:
        return 1

    return fibonacci(n-2) + fibonacci(n-1)

print(fibonacci(0))
print(fibonacci(1))
print(fibonacci(4))
