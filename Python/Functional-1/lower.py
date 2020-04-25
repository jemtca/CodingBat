
# given a list of strings, return a list where each string is converted to lower case
def lower(list):
    new_list =[]

    for x in list:
        new_list.append(x.lower())

    return new_list

print(lower(['Hello', 'Hi']))
print(lower(['AAA', 'BBB', 'ccc']))
print(lower(['KitteN', 'ChocolaTE']))
