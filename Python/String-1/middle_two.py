
# given a string of even length, return a string made of the middle two chars
# the string length will be at least 2
def middle_two(str):
    s = ''

    if len(str) > 1:
        s = str[(int)(len(str)/2)-1:(int)(len(str)/2)+1]
        

    return s

print(middle_two('string'))
print(middle_two('code'))
print(middle_two('Practice'))
