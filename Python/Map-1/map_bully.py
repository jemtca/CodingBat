
# modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value ""
# basically "b" is a bully, taking the value and replacing it with the empty string
def mapBully(d):
    if 'a' in d:
        d['b'] = d['a']
        d['a'] = ''
    return d

print(mapBully({'a': 'candy', 'b': 'dirt'}))
print(mapBully({'a': 'candy'}))
print(mapBully({'a': 'candy', 'b': 'carrot', 'c': 'meh'}))
