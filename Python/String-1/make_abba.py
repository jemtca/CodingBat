
# given two strings, a and b, return the result of putting them together in the order abba
def make_abba(a, b):
    return a + b + b + a

print(make_abba('Hi', 'Bye'))
print(make_abba('Yo', 'Alice'))
print(make_abba('What', 'Up'))
