
# given a positive int n, return true if it contains a 1 digit
# note: use % to get the rightmost digit, and / to discard the rightmost digit
def has_one(n):
    b = False
    length = len(str(n))
    temp = n

    i = 0
    while i < length and not b:
        if temp % 10 == 1:
            b = True
        temp = (int)(temp / 10)
        i += 1

    return b

print(has_one(10))
print(has_one(22))
print(has_one(220))
