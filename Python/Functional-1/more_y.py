
# given a list of strings, return a list where each string has "y" added at its start and end
def more_y(list):
    new_list = []

    for x in list:
        new_list.append('y' + x + 'y')

    return new_list

print(more_y(['a', 'b', 'c']))
print(more_y(['hello', 'there']))
print(more_y(['yyayy']))
