
#
#
def has_bad(str):
    b = False

    if len(str) >= 3 and str[:3] == 'bad':
        b = True
    if len(str) >= 4 and str[1:4] == 'bad':
        b = True

    return b

print(has_bad('badxx'))
print(has_bad('xbadxx'))
print(has_bad('xxbadxx'))
