
# modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then set "c" to have the longer value
# if the values exist and have the same length, change them both to the empty string in the map
def map_ab4(d):
    if 'a' in d and 'b' in d:
        if len(d['a']) > len(d['b']):
            d['c'] = d['a']
        elif len(d['a']) < len(d['b']):
            d['c'] = d['b']
        else:
            d['a'] = ''
            d['b'] = ''

    return d

print(map_ab4({'a': 'aaa', 'b': 'bb', 'c': 'cake'}))
print(map_ab4({'a': 'aa', 'b': 'bbb', 'c': 'cake'}))
print(map_ab4({'a': 'aa', 'b': 'bbb'}))
