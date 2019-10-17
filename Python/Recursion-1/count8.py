
# given a non-negative int n, compute recursively the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4
def count8(n):
    if n == 0:
        return 0

    if (int)(n%10) == 8:
        if (int)((n/10)%10) == 8:
            return 2 + count8(n/10)
        else:
            return 1 + count8(n/10)
    else:
        return count8(n/10)

print(count8(8))
print(count8(818))
print(count8(8818))
