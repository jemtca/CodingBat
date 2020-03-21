
# we'll say that 2 strings "match" if they are non-empty and their first chars are the same
# loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array
# when a position in the array has been swapped, it no longer matches anything
# using a map, this can be solved making just one pass over the array
def all_swap(str):
    d = {}

    for index, value in enumerate(str):
        if not value[0] in d:
            d[value[0]] = index
        else:
            i = d[value[0]]
            v = value
            str[index] = str[i]
            str[i] = v
            del d[value[0]]

    return str

print(all_swap(['ab', 'ac']))
print(all_swap(['ax', 'bx', 'cx', 'cy', 'by', 'ay', 'aaa', 'azz']))
print(all_swap(['ax', 'bx', 'ay', 'by', 'ai', 'aj', 'bx', 'by']))
