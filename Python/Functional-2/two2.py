
# given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2
def two2(nums):
    new_list = []

    for x in nums:
        x = x * 2
        if x % 10 != 2:
            new_list.append(x)

    return new_list

print(two2([1, 2, 3]))
print(two2([2, 6, 11]))
print(two2([0]))
