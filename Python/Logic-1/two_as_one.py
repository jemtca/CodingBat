
# given three ints, a b c, return true if it is possible to add two of the ints to get the third
def two_as_one(a, b, c):
    bool = False

    if a + b == c or b + c == a or a + c == b:
        bool = True 

    return bool

print(two_as_one(1, 2, 3))
print(two_as_one(3, 1, 2))
print(two_as_one(3, 2, 2))
