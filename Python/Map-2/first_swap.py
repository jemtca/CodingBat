
# we'll say that 2 strings "match" if they are non-empty and their first chars are the same
# loop over and then return the given array of non-empty strings as follows: if a string matches an earlier string in the array, swap the 2 strings in the array
# a particular first char can only cause 1 swap, so once a char has caused a swap, its later swaps are disabled
# using a map, this can be solved making just one pass over the array
def first_swap(str):
    d = {}
    d_first_char = {}

    for index, value in enumerate(str):
        if not value[0] in d_first_char:
            if not value[0] in d:
                d[value[0]] = index
            else:
                i = d[value[0]] 
                v = str[i]
                str[i] = value
                str[index] = v
                del d[value[0]]
                d_first_char[value[0]] = value[0]

    return str

print(first_swap(['ab', 'ac']))
print(first_swap(['ax', 'bx', 'cx', 'cy', 'by', 'ay', 'aaa', 'azz']))
print(first_swap(['ax', 'bx', 'ay', 'by', 'ai', 'aj', 'bx', 'by']))
