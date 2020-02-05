
# given a map of food keys and topping values, modify and return the map as follows: if the key "potato" has a value, set that as the value for the key "fries"
# if the key "salad" has a value, set that as the value for the key "spinach"
def topping3(d):
    if 'potato' in d:
        d['fries'] = d['potato']
    
    if 'salad' in d:
        d['spinach'] = d['salad']

    return d

print(topping3({'potato': 'ketchup'}))
print(topping3({'potato': 'butter'}))
print(topping3({'salad': 'oil', 'potato': 'ketchup'}))
