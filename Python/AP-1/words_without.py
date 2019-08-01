
# given an array of strings, return a new array without the strings that are equal to the target string
def words_without(words, target):
    new_list = []

    i = 0
    while i < len(words):
        if words[i] != target:
            new_list.append(words[i])
        i += 1

    return new_list

print(words_without(['a', 'b', 'c', 'a'], 'a'))
print(words_without(['a', 'b', 'c', 'a'], 'b'))
print(words_without(['a', 'b', 'c', 'a'], 'c'))
