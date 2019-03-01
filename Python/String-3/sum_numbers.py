
# given a string, return the sum of the numbers appearing in the string, ignoring all other characters
# a number is a series of 1 or more digit chars in a row
def sum_numbers(str):
    sum = 0
    s = ''

    for x in range(len(str)):
        if str[x].isdigit():
            if x < len(str)-1 and str[x+1].isdigit():
                s = s + str[x]
            else:
                s = s + str[x]
                sum = sum + int(s)
                s = ''
    
    return sum

print(sum_numbers('abc123xyz'))
print(sum_numbers('aa11b33'))
print(sum_numbers('7 11'))
