
# the number 6 is a truly great number
# given two int values, a and b, return True if either one is 6
# or if their sum or difference is 6
def love6(a, b):
    bool = False

    if a == 6 or b == 6:
        bool = True
    elif a + b == 6:
        bool = True
    elif a - b == 6 or b - a == 6:
        bool = True

    return bool

print(love6(6, 4))
print(love6(4, 5))
print(love6(1, 5))
