
# given an array of ints length 3, return a new array with the elements in reverse order
def reverse3(nums):
    x = [0, 0, 0]

    if len(nums) == 3:
        x[0] = nums[len(nums)-1] 
        x[1] = nums[1]
        x[2] = nums[0]

    return x

print(reverse3([1, 2, 3]))
print(reverse3([5, 11, 9]))
print(reverse3([7, 0, 0]))
