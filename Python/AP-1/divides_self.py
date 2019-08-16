
# we'll say that a positive int divides itself if every digit in the number divides into the number evenly
# so for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly
# we'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides itself
def divides_self(n):
    b = True
    length = len(str(n))
    temp1 = n
    temp2 = n

    i = 0
    while i < length:
        temp1 = (int)(temp2 % 10)
        if temp1 == 0 or n % temp1 != 0:
            b = False
        temp2 = (int)(temp2 / 10)
        i += 1

    return b

print(divides_self(128))
print(divides_self(12))
print(divides_self(120))
