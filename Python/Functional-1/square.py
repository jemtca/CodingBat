
# given a list of integers, return a list where each integer is multiplied with itself
def square(nums):
    new_list = []

    for x in nums:
        new_list.append(x * x)

    return new_list

print(square([1, 2, 3]))
print(square([6, 8, -6, -8, 1]))
print(square([]))
