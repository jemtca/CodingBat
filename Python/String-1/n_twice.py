
# given a string and an int n, return a string made of the first and last n chars from the string
# the string length will be at least n
def n_twice(str, n):
    s = ''

    if len(str) >= n:
        s = str[:n] + str[-n:]

    return s

print(n_twice('Hello', 2))
print(n_twice('Chocolate', 3))
print(n_twice('Chocolate', 1))
