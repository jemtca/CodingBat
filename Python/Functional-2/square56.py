
# given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of the resulting numbers that end in 5 or 6
def square56(nums):
    new_list = []

    for x in nums:
        if ((x * x) + 10) % 10 != 5 and ((x * x) + 10) % 10 != 6:
            new_list.append((x * x) + 10)

    return new_list

print(square56([3, 1, 4]))
print(square56([1]))
print(square56([2]))
