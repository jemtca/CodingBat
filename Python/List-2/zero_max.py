
# return a version of the given array where each zero value in the array is replaced by the largest odd value to the right of the zero in the array
# if there is no odd value to the right of the zero, leave the zero as a zero
def zero_max(nums):

    for x in range(len(nums)):
        largest_odd = 0
        if nums[x] == 0:
            i = x+1
            while i < len(nums):
                if nums[i] % 2 != 0 and largest_odd < nums[i]:
                    largest_odd = nums[i]
                i += 1
            nums[x] = largest_odd

    return nums

print(zero_max([0, 5, 0, 3]))
print(zero_max([0, 4, 0, 3]))
print(zero_max([0, 1, 0]))
