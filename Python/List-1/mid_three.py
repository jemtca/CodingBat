
# given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array
#  the array length will be at least 3
def mid_three(nums):
    i = [0, 0, 0]

    if len(nums) > 2 and len(nums) % 2 != 0:
        i[0] = nums[int(len(nums)/2) - 1]
        i[1] = nums[int(len(nums)/2)]
        i[2] =nums[int(len(nums)/2) + 1]

    return i

print(mid_three([1, 2, 3, 4, 5]))
print(mid_three([8, 6, 7, 5, 3, 0, 9]))
print(mid_three([1, 2, 3]))
