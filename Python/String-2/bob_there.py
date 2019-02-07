
# return true if the given string contains a "bob" string, but where the middle 'o' char can be any char
def bob_there(str):
    b = False

    if len(str) > 2:
        for x in range(len(str) - 2):
            if str[x] == 'b' and str[x+2] == 'b':
                b = True

    return b

print(bob_there('abcbob'))
print(bob_there('b9b'))
print(bob_there('bac'))
