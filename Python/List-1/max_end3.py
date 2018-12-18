
# given a list of ints length 3, figure out which is larger, the first or last element in the list, and set all the other elements to be that value
# return the changed list
def num_max3(nums):
    new_list = []
    
    if len(nums) == 3:
        if nums[0] > nums[2]:
            new_list.append(nums[0])
            new_list.append(nums[0])
            new_list.append(nums[0])
        else:
            new_list.append(nums[2])
            new_list.append(nums[2])
            new_list.append(nums[2])

    return new_list

print(num_max3([1, 2, 3]))
print(num_max3([11, 5, 9]))
print(num_max3([2, 11, 3]))
