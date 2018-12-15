
# we'll say that a 1 immediately followed by a 3 in a list is an "unlucky" 1
# return true if the given list contains an unlucky 1 in the first 2 or last 2 positions in the list
def unlucky1(nums):
    b = False

    if len(nums) > 1:
        if (nums[0] == 1 and nums[1] == 3) or (nums[1] == 1 and nums[2] == 3):
            b = True
        elif nums[int(len(nums)) - 2] == 1 and nums[int(len(nums)) - 1] == 3:
            b = True

    return b

print(unlucky1([1, 3, 4, 5]))
print(unlucky1([2, 1, 3, 4, 5]))
print(unlucky1([1, 1, 1]))
