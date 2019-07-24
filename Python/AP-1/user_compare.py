
# we have data for two users, A and B, each with a String name and an int id
# the goal is to order the users such as for sorting
# return -1 if A comes before B, 1 if A comes after B, and 0 if they are the same
# order first by the string names, and then by the id numbers if the names are the same
def user_compare(a_name, a_id, b_name, b_id):
    x = 0

    if a_name < b_name:
        x = -1
    elif a_name > b_name:
        x = 1
    else:
        if a_id < b_id:
            x = -1
        elif a_id > b_id:
            x = 1

    return x

print(user_compare('bb', 1, 'zz', 2))
print(user_compare('bb', 1, 'aa', 2))
print(user_compare('bb', 1, 'bb', 1))
