
# the classic word-count algorithm: given an array of strings
# return a Map<String, Integer> with a key for each different string, with the value the number of times that string appears in the array
def word_count(str):
    d = {}
    
    for x in str:
        if not x in d:
            d[x] = 1
        else:
            value = d[x]
            d[x] = value + 1

    return d

print(word_count(['a', 'b', 'a', 'c', 'b']))
print(word_count(['c', 'b', 'a']))
print(word_count(['c', 'c', 'c', 'c']))
