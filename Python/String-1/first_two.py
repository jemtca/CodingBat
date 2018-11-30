
# given a string, return the string made of its first two chars
# if the string is shorter than length 2, return whatever there is 
def first_two(str):
    s = ''

    if len(str) > 1:
        s = str[:2]
    else:
        s = str

    return s

print(first_two('Hello'))
print(first_two('abcdefg'))
print(first_two('ab'))
