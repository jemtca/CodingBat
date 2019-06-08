
# given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side
def can_balance(nums):
    b = False
    found = False
    first_side = 0
    second_side = 0

    i = 0
    while i < len(nums) and not found:
        first_side = first_side + nums[i]
        j = i + 1
        while j < len(nums):
            second_side = second_side + nums[j]
            j += 1
        if first_side == second_side:
            found = True
            b = True
        second_side = 0
        i += 1

    return b

print(can_balance([1, 1, 1, 2, 1]))
print(can_balance([2, 1, 1, 2, 1]))
print(can_balance([10, 10]))
