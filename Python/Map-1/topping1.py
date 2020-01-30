
# given a map of food keys and topping values, modify and return the map as follows: if the key "ice cream" is present, set its value to "cherry"
# in all cases, set the key "bread" to have the value "butter"
def topping1(d):
    if 'ice cream' in d:
        d['ice cream'] = 'cherry'
    d['bread'] = 'butter'

    return d

print(topping1({'ice cream': 'peanuts'}))
print(topping1({}))
print(topping1({'pancake': 'syrup'}))
