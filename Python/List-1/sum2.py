
# given a list of ints, return the sum of the first 2 elements in the list
# if the list length is less than 2, just sum up the elements that exist, returning 0 if the list is length 0
def sum2(nums):
    sum = 0

    if len(nums) > 0:
        if len(nums) == 1:
            sum = nums[0]
        else:
            sum = nums[0] + nums[1]
    
    return sum

print(sum2([1, 2, 3]))
print(sum2([1, 1]))
print(sum2([1, 1, 1, 1]))
