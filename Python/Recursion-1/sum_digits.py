
# given a non-negative int n, return the sum of its digits recursively
def sum_digits(n):
    if n == 0:
        return 0
    
    return n%10 + sum_digits(int(n/10))

print(sum_digits(126))
print(sum_digits(49))
print(sum_digits(12))
