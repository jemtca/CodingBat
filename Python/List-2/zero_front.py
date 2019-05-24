
# return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are grouped at the start of the array
# the order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}
def zero_front(nums):
    new_list = []
    zeros = 0
    number = 0

    for x in range(len(nums)):
        if nums[x] == 0:
            new_list.append(0)
            zeros += 1
        else:
            number = nums[x]

    for x in range(zeros,len(nums)):
        new_list.append(number)

    return new_list

print(zero_front([1, 0, 0, 1]))
print(zero_front([0, 1, 1, 0, 1]))
print(zero_front([1, 0]))
