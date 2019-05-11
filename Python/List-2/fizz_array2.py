
# given a number n, create and return a new string array of length n, containing the strings "0", "1" "2" .. through n-1
# n may be 0, in which case just return a length 0 array
def fizz_array2(n):
    new_list = []

    for x in range(n):
        new_list.append(x)

    return new_list

print(fizz_array2(4))
print(fizz_array2(10))
print(fizz_array2(2))
