
# given an array of strings, return a Map<String, Integer> containing a key for every different string in the array, always with the value 0
def word0(str):
    dict = {}

    for x in str:
        if not x in dict:
            dict[x] = 0

    return dict

print(word0(['a', 'b', 'c']))
print(word0(['a', 'b', 'a', 'c', 'b']))
print(word0(['c', 'b', 'a']))
