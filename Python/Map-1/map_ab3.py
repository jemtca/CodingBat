
# modify and return the given map as follows: if exactly one of the keys "a" or "b" has a value in the map (but not both), set the other to have that same value in the map
def map_ab3(d):
    if 'a' in d and not 'b' in d:
        d['b'] = d['a']
    elif not 'a' in d and 'b' in d:
        d['a'] = d['b']

    return d

print(map_ab3({'a': 'aaa', 'c': 'cake'}))
print(map_ab3({'b': 'bbb', 'c': 'cake'}))
print(map_ab3({'a': 'aaa', 'b': 'bbb', 'c': 'cake'}))
