
# given a string of odd length, return the string length 3 from its middle
# the string length will be at least 3
def middle_three(str):
    s = ''
    middle = (int)(len(str)/2)
    
    s = str[middle-1:middle+2]

    return s

print(middle_three('Candy'))
print(middle_three('and'))
print(middle_three('solving'))
