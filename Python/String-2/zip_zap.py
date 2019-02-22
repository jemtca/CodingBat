
# look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'
# return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp"
def zip_zap(str):
    s = ''
    i = 0

    while (i < len(str)):
        if i < len(str)-2 and str[i] == 'z' and str[i+2] == 'p':
            s = s + str[i] + str[i+2]
            i += 2
        else:
            s = s + str[i]
        i += 1

    return s

print(zip_zap('zipXzap'))
print(zip_zap('zopzop'))
print(zip_zap('zzzopzop'))
