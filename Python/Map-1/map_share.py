
# modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that same value
# in all cases remove the key "c", leaving the rest of the map unchanged
def map_share(d):
    if 'a' in d:
        d['b'] = d['a']
    d.pop('c')

    return d

print(map_share({'a': 'aaa', 'b': 'bbb', 'c': 'ccc'}))
print(map_share({'b': 'xyz', 'c': 'ccc'}))
print(map_share({'a': 'aaa', 'c': 'meh', 'd': 'hi'}))
