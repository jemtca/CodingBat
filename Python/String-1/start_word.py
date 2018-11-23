
# given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly
# on a match, return the front of the string, or otherwise return the empty string
# the word will be at least length 1
def start_word(str, word):
    s = ''

    if not (len(str) < len(word)) and word[1:] == str[1:len(word)]:
        s  = str[:len(word)]

    return s

print(start_word('hippo', 'hi'))
print(start_word('hippo', 'xip'))
print(start_word('hippo', 'i'))
