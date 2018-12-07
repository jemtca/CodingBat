
# given a string, return a version without the first 2 chars
# except keep the first char if it is 'a' and keep the second char if it is 'b'
# the string may be any length
def de_front(str):
    s = ''

    if str[0] == 'a' and str[1] == 'b':
        s = str
    elif str[0] == 'a' and str[1] != 'b':
        s = str[0] + str[2:]
    elif str[0] != 'a' and str[1] == 'b':
        s = str[1:]
    else:
        s = str[2:]

    return s

print(de_front('Hello'))
print(de_front('java'))
print(de_front('away'))
