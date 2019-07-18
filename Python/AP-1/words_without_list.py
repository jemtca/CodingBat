
# given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the given length are omitted
def words_without_list(words, l):
    new_list = []

    i = 0
    while i < len(words):
        if len(words[i]) != l:
            new_list.append(words[i])
        i += 1

    return new_list

print(words_without_list(["a", "bb", "b", "ccc"], 1))
print(words_without_list(["a", "bb", "b", "ccc"], 3))
print(words_without_list(["a", "bb", "b", "ccc"], 4))
