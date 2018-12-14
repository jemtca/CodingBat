
# given a list of ints length 3, return a new list with the elements in reverse order
def reverse3(nums):
    new_list = []

    if len(nums) == 3:
        new_list.append(nums[2])
        new_list.append(nums[1])
        new_list.append(nums[0])

    return new_list

print(reverse3([1, 2, 3]))
print(reverse3([5, 11, 9]))
print(reverse3([7, 0, 0]))
