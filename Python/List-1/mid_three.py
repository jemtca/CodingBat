
# given a list of ints of odd length, return a new list length 3 containing the elements from the middle of the list
# the list length will be at least 3
def mid_three(nums):
    new_list = []

    if len(nums) > 2 and len(nums) % 2 != 0:
        new_list.append(nums[int(len(nums)/2)-1])
        new_list.append(nums[int(len(nums)/2)])
        new_list.append(nums[int(len(nums)/2)+1])
        
    return new_list

print(mid_three([1, 2, 3, 4, 5]))
print(mid_three([8, 6, 7, 5, 3, 0, 9]))
print(mid_three([1, 2, 3]))
