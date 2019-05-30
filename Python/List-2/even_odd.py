
# return an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers
# other than that, the numbers can be in any order 
def even_odd(nums):
    new_list = []

    for x in range(len(nums)):
        if nums[x] % 2 == 0:
            new_list.append(nums[x])
    
    for x in range(len(nums)):
        if nums[x] % 2 != 0:
            new_list.append(nums[x])

    return new_list

print(even_odd([1, 0, 1, 0, 0, 1, 1]))
print(even_odd([3, 3, 2]))
print(even_odd([2, 2, 2]))
