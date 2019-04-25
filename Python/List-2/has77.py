
# given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}
def has77(nums):
    b = False

    for x in range(len(nums)):
        if (x < len(nums) - 1 and nums[x] == 7 and nums[x+1] == 7) or (x < len(nums) - 2 and nums[x] == 7 and nums[x+2] == 7):
            b = True

    return b

print(has77([1, 7, 7]))
print(has77([1, 7, 1, 7]))
print(has77([1, 7, 1, 1, 7]))
