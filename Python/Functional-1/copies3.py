
# given a list of strings, return a list where each string is replaced by 3 copies of the string concatenated together
def copies3(list):
    new_list = []

    for x in list:
        new_list.append(x + x + x)

    return new_list

print(copies3(['a', 'bb', 'ccc']))
print(copies3(['24', 'a', '']))
print(copies3(['hello', 'there']))
