
# given a list of ints length 3, return the sum of all the elements
def sum3(nums):
    sum = 0

    if len(nums) == 3:
        sum = nums[0] + nums[1] + nums[2]

    return sum

print(sum3([1, 2, 3]))
print(sum3([5, 11, 2]))
print(sum3([7, 0, 0]))
