
# given an int list, return a new list with double the length where its last element is the same as the original list, and all the other elements are 0
# the original list will be length 1 or more
def make_last(nums):
    new_list = []
    new_length = len(nums)*2
    
    if len(nums) > 0:
        for _ in range(new_length-1):
            new_list.append(0)
        new_list.append(nums[len(nums)-1])

    return new_list

print(make_last([4, 5, 6]))
print(make_last([1, 2]))
print(make_last([3]))
