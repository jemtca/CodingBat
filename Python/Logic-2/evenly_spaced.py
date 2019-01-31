
# given three ints, a b c, one of them is small, one is medium and one is large
# return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large
def evenly_spaced(a, b, c):
    bool = False
    small = min(a, b)
    small = min(small, c)
    large = max (a, b)
    large = max (large, c)
    medium = (a + b + c) - (small + large)

    if medium - small == large - medium:
        bool = True

    return bool

print(evenly_spaced(2, 4, 6))
print(evenly_spaced(4, 6, 2))
print(evenly_spaced(4, 6, 3))
