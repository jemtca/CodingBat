
# we'll say that a "mirror" section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order
# for example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1} is length 3 (the {1, 2, 3} part)
# return the size of the largest mirror section found in the given array
def max_mirror(nums):
    m = 0

    start = 0
    while start < len(nums):
        begin = len(nums) - 1
        while begin >= 0:
            size = 0
            i = start
            j = begin

            while i < len(nums) and j >= 0 and nums[i] == nums[j]:
                size += 1
                i += 1
                j -= 1
            
            m = max(m, size) 
            begin -= 1
        start += 1

    return m

print(max_mirror([1, 2, 3, 8, 9, 3, 2, 1]))
print(max_mirror([1, 2, 1, 4]))
print(max_mirror([7, 1, 2, 9, 7, 2, 1]))
