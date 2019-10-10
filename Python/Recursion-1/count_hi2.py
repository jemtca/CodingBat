
# given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them
def count_hi2(str):
    count = 0

    if not str:
        return count
    if len(str) > 1 and str[0] == 'h' and str[1] == 'i':
        count += 1
        return count + count_hi2(str[2:])
    elif len(str) > 2 and str[0] != 'x' and str[1] == 'h' and str[2] == 'i':
        count += 1
        return count + count_hi2(str[3:])
    elif len(str) > 2 and str[0] == 'x' and str[1] == 'h' and str[2] == 'i':
        return count + count_hi2(str[3:])
    elif len(str) > 2 and str[1] == 'h' and str[2] != 'i':
        return count + count_hi2(str[2:])
    else:
        return count + count_hi2(str[1:])

print(count_hi2('ahixhi'))
print(count_hi2('ahibhi'))
print(count_hi2('xhixhi'))
