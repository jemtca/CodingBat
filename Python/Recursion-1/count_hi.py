
#
def count_hi(str):
    if not str:
        return 0
    
    if len(str) > 1 and str[:2].lower() == 'hi':
        return 1 + count_hi(str[2:])
    else:
        return count_hi(str[1:])

print(count_hi('xxhixx'))
print(count_hi('xhixhix'))
print(count_hi('hi'))
