
# given a list of non-negative integers, return a list of those numbers except omitting any that end with 9
def no9(nums):
    new_list = []

    for x in nums:
        if x % 10 != 9:
            new_list.append(x)

    return new_list

print(no9([1, 2, 19]))
print(no9([9, 19, 29, 3]))
print(no9([1, 2, 3]))
