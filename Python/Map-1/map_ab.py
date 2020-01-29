
# modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys
# if both keys are present, append their 2 string values together and store the result under the key "ab"
def map_ab(d):
    if 'a' in d and 'b' in d:
        d['ab'] = d['a'] + d['b']

    return d

print(map_ab({'a': 'Hi', 'b': 'There'}))
print(map_ab({'a': 'Hi'}))
print(map_ab({'b': 'There'}))
