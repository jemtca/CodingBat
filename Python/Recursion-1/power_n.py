
# given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power, so powerN(3, 2) is 9 (3 squared)
def power_n(base, n):
    if n == 0:
        return 1
    
    return base * power_n(base, n-1)

print(power_n(3, 1))
print(power_n(3, 2))
print(power_n(3, 3))
