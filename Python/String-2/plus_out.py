
# given a string and a non-empty word string, return a version of the original String where all chars have been replaced by pluses ("+")
# except for appearances of the word string which are preserved unchanged
def plus_out(str, word):
    s = str

    if word in s:
        s = s.replace(word, '--')
    
    for x in range(len(str)):
        if str[x] != '-':
            s = s.replace(str[x:x+1], '+')

    s = s.replace('--', word)

    return s

print(plus_out('12xy34', 'xy'))
print(plus_out('12xy34', '1'))
print(plus_out('12xy34xyabcxy', 'xy'))
