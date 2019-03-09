
# given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other characters
# return 0 if there are no digits in the string
def sum_digits(str):
    sum = 0

    for x in range(len(str)):
        if str[x].isdigit():
            sum = sum + int(str[x])

    return sum

print(sum_digits('aa1bc2d3'))
print(sum_digits('aa11b33'))
print(sum_digits('Chocolate'))
