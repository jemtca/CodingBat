
# given a map of food keys and their topping values, modify and return the map as follows: if the key "ice cream" has a value, set that as the value for the key "yogurt" also
# if the key "spinach" has a value, change that value to "nuts"
def topping2(d):
    if 'ice cream' in d:
        d['yogurt'] = d['ice cream']
    
    if 'spinach' in d:
        d['spinach'] = 'nuts'

    return d

print(topping2({'ice cream': 'cherry'}))
print(topping2({'spinach': 'dirt', 'ice cream': 'cherry'}))
print(topping2({'yogurt': 'salt'}))
