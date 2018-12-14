
# given a list of ints of even length, return a new list length 2 containing the middle two elements from the original list
# the original list will be length 2 or more
def make_middle(nums):
    new_list = []

    if len(nums) > 1 and len(nums) % 2 == 0:
        new_list.append(nums[int(len(nums)/2)-1])
        new_list.append(nums[int(len(nums)/2)])

    return new_list

print(make_middle([1, 2, 3, 4]))
print(make_middle([7, 1, 2, 3, 4, 9]))
print(make_middle([1, 2]))
