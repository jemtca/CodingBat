
# return the number of times that the string "code" appears anywhere in the given string
# except we'll accept any letter for the 'd', so "cope" and "cooe" count
def count_code(str):
    count = 0

    if len(str) > 3:
        for x in range(len(str) - 3):
            if str[x] == 'c' and str[x+1] == 'o' and str[x+3] == 'e':
                count += 1

    return count

print(count_code('aaacodebbb'))
print(count_code('codexxcode'))
print(count_code('Hi-cozexxcope'))
