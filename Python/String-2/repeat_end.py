
# given a string and an int n, return a string made of n repetitions of the last n characters of the string
# you may assume that n is between 0 and the length of the string, inclusive
def repeat_end(str, n):
    s = ''
    last = str[len(str) - n:]

    for _ in range(n):
        s = s + last

    return s

print(repeat_end('Hello', 3))
print(repeat_end('Hello', 2))
print(repeat_end('Hello', 1))
