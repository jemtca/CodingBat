
# given a list of ints of odd length, look at the first, last, and middle values in the list and return the largest
# the list length will be a least 1
def max_triple(nums):
    max = 0

    if len(nums) > 0:
        first = nums[0] 
        middle = nums[int(len(nums)/2)]
        last = nums[len(nums)-1]

        if first > middle and first > last:
            max = first
        elif middle > first and middle > last:
            max = middle
        else:
            max = last

    return max

print(max_triple([1, 2, 3]))
print(max_triple([1, 5, 3]))
print(max_triple([5, 2, 3]))
