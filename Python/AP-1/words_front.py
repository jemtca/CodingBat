
# given an array of strings, return a new array containing the first n strings
# n will be in the range 1..length
def words_front(words, n):
    new_list = []

    i = 0
    while i < n:
        new_list.append(words[i])
        i += 1

    return new_list

print(words_front(['a', 'b', 'c', 'd'], 1))
print(words_front(['a', 'b', 'c', 'd'], 2))
print(words_front(['a', 'b', 'c', 'd'], 3))
