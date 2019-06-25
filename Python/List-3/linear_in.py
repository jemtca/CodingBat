
# given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer
# the best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order
def linear_in(outer, inner):
    b = True
    found = False

    i = 0
    while i < len(inner) and b:
        found = False
        j = 0
        while j < len(outer) and not found:
            if inner[i] == outer[j]:
                found = True
            j += 1
        if not found:
            b = False
        i += 1

    return b

print(linear_in([1, 2, 4, 6], [2, 4]))
print(linear_in([1, 2, 4, 6], [2, 3, 4]))
print(linear_in([1, 2, 4, 4, 6], [2, 4]))
