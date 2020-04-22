
# given a list of non-negative integers, return an integer list of the rightmost digits
def right_digit(list):
    new_list = []

    for x in list:
        new_list.append(x % 10)

    return new_list

print(right_digit([1, 2, 93]))
print(right_digit([16, 8, 886, 8, 1]))
print(right_digit([10, 0]))
