
# given 2 lists of ints, a and b, return true if they have the same first element or they have the same last element
# both lists will be length 1 or more
def common_end(a, b):
    bool = False

    if len(a) > 0 and len(b) > 0:
        if a[:1] == b[:1] or a[-1:] == b[-1:]:
            bool = True

    return bool

print(common_end([1,2,3], [7,3]))
print(common_end([1,2,3], [7,3,2]))
print(common_end([1,2,3], [1,2]))
