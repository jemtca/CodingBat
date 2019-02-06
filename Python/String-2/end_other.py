
# given two strings, return true if either of the strings appears at the very end of the other string
# ignoring upper/lower case differences (in other words, the computation should not be "case sensitive")
def end_other(a, b):
    bool = False
    small = ''
    big = ''

    if len(a) >= len(b):
        big = a
        small = b
    else:
        big = b
        small = a
    
    if small.lower() == big[len(big)-len(small):].lower():
        bool = True

    return bool

print(end_other('Hiabc', 'abc'))
print(end_other('AbC', 'Hiabc'))
print(end_other('abc', 'abXabc'))
