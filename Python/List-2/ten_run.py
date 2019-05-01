
# for each multiple of 10 in the given array, change all the values following it to be that multiple of 10, until encountering another multiple of 10
# so {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}
def ten_run(nums):
    new_list = []
    found = False
    not_first = False
    value = 0

    i = 0
    while i < len(nums):
        if not_first:
            new_list.append(value)
        elif nums[i] % 10 != 0:
            new_list.append(nums[i])
        else:
            not_first = True
            value = nums[i]
            new_list.append(nums[i])
            j = i+1
            while j < len(nums) and not found:
                if nums[j] % 10 != 0:
                    new_list.append(value)
                else:
                    new_list.append(value)
                    value = nums[j]
                    found = True
                i += 1
                j += 1
        i += 1

    return new_list

print(ten_run([2, 10, 3, 4, 20, 5]))
print(ten_run([10, 1, 20, 2]))
print(ten_run([10, 1, 9, 20]))
