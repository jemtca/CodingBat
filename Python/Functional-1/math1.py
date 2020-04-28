
# given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10
def math1(nums):
    new_list = []

    for x in nums:
        new_list.append((x + 1) * 10)

    return new_list

print(math1([1, 2, 3]))
print(math1([6, 8, 6, 8, 1]))
print(math1([10]))
