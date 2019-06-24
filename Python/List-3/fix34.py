
# return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4
# do not move the 3's, but every other number may move
# the array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4
def fix34(nums):
    holder = -1
    after3 = []
    position4 = []

    i = 0
    while i < len(nums):
        if nums[i] == 3:
            after3.append(i + 1)
        elif nums[i] == 4:
            position4.append(i)
        i += 1
    
    j = 0
    while j < len(after3):
        holder = nums[after3[j]]
        nums[after3[j]] = nums[position4[j]]
        nums[position4[j]] = holder
        j += 1

    return nums

print(fix34([1, 3, 1, 4]))
print(fix34([1, 3, 1, 4, 4, 3, 1]))
print(fix34([3, 2, 2, 4]))
