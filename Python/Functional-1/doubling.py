
# given a list of integers, return a list where each integer is multiplied by 2
def doubling(nums):
    new_numbers = []
    
    for x in nums:
        new_numbers.append(x * 2)

    return new_numbers

print(doubling([1, 2, 3]))
print(doubling([6, 8, 6, 8, -1]))
print(doubling([]))
