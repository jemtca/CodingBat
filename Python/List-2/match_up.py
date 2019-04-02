
# given arrays nums1 and nums2 of the same length, for every element in nums1, consider the corresponding element in nums2 (at the same index)
# return the count of the number of times that the two elements differ by 2 or less, but are not equal
def match_up(nums1, nums2):
    count = 0

    for x in range(len(nums1)):
        if abs(nums1[x] - nums2[x]) <= 2 and nums1[x] != nums2[x]: 
            count += 1

    return count

print(match_up([1, 2, 3], [2, 3, 10]))
print(match_up([1, 2, 3], [2, 3, 5]))
print(match_up([1, 2, 3], [2, 3, 3]))
