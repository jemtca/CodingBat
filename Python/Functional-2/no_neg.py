
# given a list of integers, return a list of the integers, omitting any that are less than 0
def no_neg(nums):
    new_list = []

    for x in nums:
        if x >= 0:
            new_list.append(x)

    return new_list

print(no_neg([1, -2]))
print(no_neg([-3, -3, 3, 3]))
print(no_neg([-1, -1, -1]))
