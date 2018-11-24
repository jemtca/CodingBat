
# given a string, return a new string made of 3 copies of the last 2 chars of the original string
# the string length will be at least 2
def extra_end(str):
    s = ''
    
    if len(str) > 1:
        s = str[-2:] + str[-2:] + str[-2:]
    
    return s

print(extra_end('Hello'))
print(extra_end('ab'))
print(extra_end('Hi'))
