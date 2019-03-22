
# return the sum of the numbers in the array, returning 0 for an empty array
# except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count
def sum13(nums):
    sum = 0

    for x in range(len(nums)):
        if nums[x] != 13:
            sum = sum + nums[x]
        else:
            x += 1

    return sum

print(sum13([1, 2, 2, 1]))
print(sum13([1, 1]))
print(sum13([1, 2, 2, 1, 13]))
