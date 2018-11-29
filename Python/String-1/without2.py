
# given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning
# so "HelloHe" yields "lloHe"
# the substring may overlap with itself, so "Hi" yields ""
# otherwise, return the original string unchanged
def without2(str):

    if len(str) == 2:
        s = ''
    elif len(str) > 2 and str[:2] == str[-2:]:
        s = str[2:]
    else:
        s = str

    return s

print(without2('HelloHe'))
print(without2('HelloHi'))
print(without2('Hi'))
