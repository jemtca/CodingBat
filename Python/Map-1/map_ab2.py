
# modify and return the given map as follows: if the keys "a" and "b" are both in the map and have equal values, remove them both
def map_ab2(d):
    if 'a' in d and 'b' in d and (d['a'] == d['b']):
        d.pop('a')
        d.pop('b')
        
    return d

print(map_ab2({'a': 'aaa', 'b': 'aaa', 'c': 'cake'}))
print(map_ab2({'a': 'aaa', 'b': 'bbb'}))
print(map_ab2({'a': 'aaa', 'b': 'bbb', 'c': 'aaa'}))
