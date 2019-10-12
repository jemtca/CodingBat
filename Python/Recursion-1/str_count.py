
# given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string, without the sub strings overlapping
def str_count(str, sub):
    count = 0

    if not str:
        return count
    if len(str) >= len(sub) and str[0:len(sub)] == sub:
        count += 1
        return count + str_count(str[len(sub):], sub)
    else :
        return count + str_count(str[1:], sub)

print(str_count('catcowcat', 'cat'))
print(str_count('catcowcat', 'cow'))
print(str_count('catcowcat', 'dog'))
