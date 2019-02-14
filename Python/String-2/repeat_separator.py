
# given two strings, word and a separator sep, return a big string made of count occurrences of the word, separated by the separator string
def repeat_separator(word, sep, count):
    s = ''

    if count > 1:
        for _ in range(count-1):
            s = s + word + sep
    
    if count >= 1:
        s = s + word

    return s

print(repeat_separator('Word', 'X', 3))
print(repeat_separator('This', 'And', 2))
print(repeat_separator('This', 'And', 1))
