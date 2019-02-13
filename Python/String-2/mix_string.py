
# given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on
# any leftover chars go at the end of the result
def mix_string(a, b):
    s = ''
    length_a = int(len(a))
    length_b = int(len(b))

    if length_a > length_b:
        for x in range(length_b):
            s = s + a[x] + b[x]
        for x in range(length_b, length_a):
            s = s + a[x]

    elif length_b > length_a:
        for x in range(length_a):
            s = s + a[x] + b[x]
        for x in range(length_a, length_b):
            s = s + b[x]

    else:
        for x in range(length_a):
            s = s + a[x] + b[x]

    return s

print(mix_string('abc', 'xyz'))
print(mix_string('Hi', 'There'))
print(mix_string('xxxx', 'There'))
