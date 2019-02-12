
# return true if the string "cat" and "dog" appear the same number of times in the given string
def cat_dog(str):
    b = True
    cat = 0
    dog = 0

    for x in range(len(str)-2):
        if str[x] == 'c' and str[x:x+3] == 'cat':
            cat += 1
    
    for x in range(len(str)-2):
        if str[x] == 'd' and str[x:x+3] == 'dog':
            dog += 1

    if cat != dog:
        b = False

    return b

print(cat_dog('catdog'))
print(cat_dog('catcat'))
print(cat_dog('1cat1cadodog'))
