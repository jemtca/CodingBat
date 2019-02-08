
# given a string, consider the prefix string made of the first N chars of the string
# does that prefix string appear somewhere else in the string?
# assume that the string is not empty and that N is in the range 1..str.length()
def prefix_again(str, n):
    b = False
    prefix = str[:n]

    for x in range(n, len(str) - (n-1)):
        if prefix == str[x:x+n]:
            b = True

    return b

print(prefix_again('abXYabc', 1))
print(prefix_again('abXYabc', 2))
print(prefix_again('abXYabc', 3))
