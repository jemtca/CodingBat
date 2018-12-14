
# given a list of ints, return true if 6 appears as either the first or last element in the list
# the list will be length 1 or more
def last_first6(nums):
    b = False

    if len(nums) > 0:
        if nums[:1] == [6] or nums[-1:] == [6]:
            b = True

    return b

print(last_first6([1,2,6]))
print(last_first6([6,1,2,3]))
print(last_first6([13,6,1,2,3]))
