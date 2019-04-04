
# return true if the group of N numbers at the start and end of the array are the same
# for example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2, and false for n=1 and n=3
# you may assume that n is in the range 0..nums.length inclusive
def same_ends(nums, l):
    b = True
    list1 = []
    list2 = []

    i = 0
    while i < l:
        list1.append(nums[i])
        i += 1

    limit = len(nums) - l
    while limit < len(nums):
        list2.append(nums[limit])
        limit += 1

    if list1 != list2:
        b = False

    return b

print(same_ends([5, 6, 45, 99, 13, 5, 6], 1))
print(same_ends([5, 6, 45, 99, 13, 5, 6], 2))
print(same_ends([5, 6, 45, 99, 13, 5, 6], 3))
