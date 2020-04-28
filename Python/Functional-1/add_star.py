
# given a list of strings, return a list where each string has "*" added at its end
def add_star(list):
    new_list = []

    for x in list:
        new_list.append(x + '*')

    return new_list

print(add_star(['a', 'bb', 'ccc']))
print(add_star(['hello', 'there']))
print(add_star(['*']))
