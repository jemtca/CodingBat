
# given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back
# the string will be non-empty
def the_end(str, front):
    return str[:1] if front else str[len(str)-1:]

print(the_end('Hello', True))
print(the_end('Hello', False))
print(the_end('oh', True))
