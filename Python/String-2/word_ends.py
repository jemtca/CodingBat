
# given a string and a non-empty word string, return a string made of each char just before and just after every appearance of the word in the string
# ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words
def word_ends(str, word):
    s = ''

    for x in range(len(str)-len(word)+1):
        if str[x:x+len(word)] == word and len(str) > len(word):
            if x == 0:
                s = s + str[x+len(word)]
            elif x == len(str) - len(word):
                s = s + str[x-1]
            else:
                s = s + str[x-1] + str[x+len(word)]
 
    return s

print(word_ends('abcXY123XYijk', 'XY'))
print(word_ends('XY123XY', 'XY'))
print(word_ends('XY1XY', 'XY'))
