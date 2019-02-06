
# return the number of times that the string "hi" appears anywhere in the given string
def count_hi(str):
    count = 0

    for x in range(len(str)-1):
        if str[x] == 'h' and str[x+1] == 'i':
            count += 1

    return count

print(count_hi('abc hi ho'))
print(count_hi('ABChi hi'))
print(count_hi('hihi'))
