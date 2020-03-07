
# given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, and the value is that string's length
def word_len(str):
    dict = {}

    for x in str:
        dict[x] = len(x)

    return dict

print(word_len(['a', 'bb', 'a', 'bb']))
print(word_len(['this', 'and', 'that', 'and']))
print(word_len(['code', 'code', 'code', 'bug']))
