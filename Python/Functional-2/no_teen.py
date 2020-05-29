
# given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive
def no_teen(nums):
    new_list = []

    for x in nums:
        if x < 13 or x > 19:
            new_list.append(x)

    return new_list

print(no_teen([12, 13, 19, 20]))
print(no_teen([1, 14, 1]))
print(no_teen([15]))
