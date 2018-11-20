
# given a string of even length, return the first half
def first_half(str):
    return str[:len(str)//2]

print(first_half('WooHoo'))
print(first_half('HelloThere'))
print(first_half('abcdef'))
