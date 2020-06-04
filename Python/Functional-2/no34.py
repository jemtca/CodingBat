
# 
def no34(strings):
    new_list = []

    for x in strings:
        if len(x) != 3 and len(x) != 4:
            new_list.append(x)

    return new_list

print(no34(["a", "bb", "ccc"]))
print(no34(["a", "bb", "ccc", "dddd"]))
print(no34(["ccc", "dddd", "apple"]))
