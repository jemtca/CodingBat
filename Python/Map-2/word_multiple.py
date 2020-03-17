
# given an array of strings, return a Map<String, Boolean> where each different string is a key and its value is true if that string appears 2 or more times in the array
def word_multiple(str):
    d = {}

    for x in str:
        if not x in d:
            d[x] = False
        else:
            d[x] = True

    return d

print(word_multiple(["a", "b", "a", "c", "b"]))
print(word_multiple(["c", "b", "a"]))
print(word_multiple(["c", "c", "c", "c"]))
