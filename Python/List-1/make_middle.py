
# given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array
# the original array will be length 2 or more
def make_middle(nums):
    i = [0, 0]

    if len(nums) > 1 and len(nums) % 2 == 0:
        i[0] = nums[int(len(nums)/2) - 1] 
        i[1] = nums[int(len(nums)/2)]

    return i

print(make_middle([1, 2, 3, 4]))
print(make_middle([7, 1, 2, 3, 4, 9]))
print(make_middle([1, 2]))
