
# given two strings, base and remove, return a version of the base string where all instances of the remove string have been removed (not case sensitive)
# you may assume that the remove string is length 1 or more
def without_string(base, remove):
    s = base

    s = s.replace(remove.lower(), '')
    s = s.replace(remove.upper(), '')
    s = s.replace(remove, '')

    return s

print(without_string('Hello there', 'llo'))
print(without_string('Hello there', 'x'))
print(without_string('Hello there', 'e'))
