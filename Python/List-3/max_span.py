
# consider the leftmost and righmost appearances of some value in an array
# we'll say that the "span" is the number of elements between the two inclusive
# a single value has a span of 1
# returns the largest span found in the given array
def max_span(nums):
    m = 0
    temp = 0

    if len(nums) == 1:
        m = 1
    elif len(nums) == 2:
        if nums[0] == nums[1]:
            m = 2
        else:
            m = 1
    elif len(nums) > 2:
        i = 0
        while i < len(nums):
            j = i + 1
            while j < len(nums):
                if nums[i] == nums[j]:
                    temp = j - i + 1
                if m < temp:
                    m = temp
                j += 1
            i += 1

    return m

print(max_span([1, 2, 1, 1, 3]))
print(max_span([1, 4, 2, 1, 4, 1, 4]))
print(max_span([1, 4, 2, 1, 4, 4, 4]))
