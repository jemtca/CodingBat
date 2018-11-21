
# given a string, if the string begins with "red" or "blue" return that color string
# otherwise return the empty string
def see_color(str):
    s = ''

    if str.startswith('red'):
        s = 'red'
    if str.startswith('blue'):
        s = 'blue'

    return s

print(see_color('redxx'))
print(see_color('xxred'))
print(see_color('blueTimes'))
