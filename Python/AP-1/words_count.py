
# given an array of strings, return the count of the number of strings with the given length
def words_count(words, l):
    x = 0

    for i in words:
        if len(i) == l:
            x += 1

    return x

print(words_count(["a", "bb", "b", "ccc"], 1))
print(words_count(["a", "bb", "b", "ccc"], 3))
print(words_count(["a", "bb", "b", "ccc"], 4))
