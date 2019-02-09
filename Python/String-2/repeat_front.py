
# given a string and an int n, return a string made of the first n characters of the string
# followed by the first n-1 characters of the string, and so on
# you may assume that n is between 0 and the length of the string, inclusive
def repeat_front(str, n):
    s = ''
    i = n

    for _ in range(n):
        s = s + str[:i]
        i -= 1

    return s

print(repeat_front('Chocolate', 4))
print(repeat_front('Chocolate', 3))
print(repeat_front('Ice Cream', 2))
