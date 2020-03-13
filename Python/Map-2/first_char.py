
# given an array of non-empty strings, return a Map<String, String> with a key for every different first character seen
# with the value of all the strings starting with that character appended together in the order they appear in the array
def first_char(str):
    d = {}
    
    for x in str:
        if not x[0] in d:
            d[x[0]] = x
        else:
            str_appended = d[x[0]] + x
            d[x[0]] = str_appended
    
    return d

print(first_char(['salt', 'tea', 'soda', 'toast']))
print(first_char(['aa', 'bb', 'cc', 'aAA', 'cCC', 'd']))
print(first_char([]))
