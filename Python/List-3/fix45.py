
# return an array that contains exactly the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5
# do not move the 4's, but every other number may move
# the array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4
# in this version, 5's may appear anywhere in the original array
def fix45(nums):
    index_after4 = []
    index5 = []

    i = 0
    while i < len(nums):
        if nums[i] == 4 and nums[i+1] != 5:
            index_after4.append(i+1)
        i += 1
    
    i = 0
    while i < len(nums):
        if i == 0 and nums[i] == 5:
            index5.append(i)
        elif i > 0 and nums[i] == 5 and nums[i-1] != 4:
            index5.append(i)
        i += 1

    i = 0
    while i < len(index_after4):
        temp = nums[index_after4[i]]
        nums[index_after4[i]] = nums[index5[i]]
        nums[index5[i]] = temp
        i += 1

    return nums

print(fix45([5, 4, 9, 4, 9, 5]))
print(fix45([1, 4, 1, 5]))
print(fix45([1, 4, 1, 5, 5, 4, 1]))
