
# given a string, return the length of the largest "block" in the string
# a block is a run of adjacent chars that are the same
def max_block(str):
    temp = 0

    if not str:
        max = 0
    else:
        max = 1

    for x in range(len(str)-1):
        if str[x] == str[x+1]:
            temp += 1
            j = x
            while(j < len(str)-1 and str[x] == str[j+1]):
                temp += 1
                j += 1
            if temp > max:
                max = temp
            temp = 0

    return max

print(max_block('hoopla'))
print(max_block('abbCCCddBBBxx'))
print(max_block(''))
