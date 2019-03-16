
# return the number of even ints in the given array
def count_evens(nums):
    count = 0

    for x in range(len(nums)):
        if nums[x] % 2 == 0:
            count += 1

    return count

print(count_evens([2, 1, 2, 3, 4]))
print(count_evens([2, 2, 0]))
print(count_evens([1, 3, 5]))
