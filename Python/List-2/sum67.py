
# return the sum of the numbers in the array, except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7)
# return 0 for no numbers
def sum67(nums):
    sum = 0
    found = False

    i = 0
    while i < len(nums):
        if nums[i] != 6:
            sum += nums[i]
        else:
            j = i
            while j < len(nums) and not found:
                if nums[j] == 7:
                    i = j
                    found = True
                j += 1
            found = False
        i += 1

    return sum

print(sum67([1, 2, 2]))
print(sum67([1, 2, 2, 6, 99, 99, 7]))
print(sum67([1, 1, 6, 7, 2]))
