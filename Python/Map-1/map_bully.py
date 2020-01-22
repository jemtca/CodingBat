
# modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value ""
# basically "b" is a bully, taking the value and replacing it with the empty string
def mapBully(map):
    if 'a' in map:
        map['b'] = map['a']
        map['a'] = ''
    return map

print(mapBully({'a': 'candy', 'b': 'dirt'}))
print(mapBully({'a': 'candy'}))
print(mapBully({'a': 'candy', 'b': 'carrot', 'c': 'meh'}))
