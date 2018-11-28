
# given a string, return true if the first 2 chars in the string also appear at the end of the string
def front_again(str):
    b = False

    if len(str) > 1:
        if str[:2] == str[-2:]:
            b = True

    return b

print(front_again('edited'))
print(front_again('edit'))
print(front_again('ed'))
