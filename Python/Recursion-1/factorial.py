
# given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1
def factorial(n):
    if n == 1:
        return 1

    return n * factorial(n-1)

print(factorial(1))
print(factorial(2))
print(factorial(3))
