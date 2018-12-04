
# given a string, return a string length 2 made of its first 2 chars
# if the string length is less than 2, use '@' for the missing chars
def at_first(str):
    s = '@@'

    if len(str) == 1:
        s = str[0] + '@'
    elif len(str) >= 2:
        s = str[:2]

    return s

print(at_first('hello'))
print(at_first('hi'))
print(at_first('h'))
