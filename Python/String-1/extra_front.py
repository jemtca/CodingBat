
# given a string, return a new string made of 3 copies of the first 2 chars of the original string
# the string may be any length
# if there are fewer than 2 chars, use whatever is there
def extra_front(str):
    s = ''

    if len(str) < 2:
        s = str + str + str
    else:
        s = str[:2] + str[:2] + str[:2]

    return s 

print(extra_front('Hello'))
print(extra_front('ab'))
print(extra_front('H'))
