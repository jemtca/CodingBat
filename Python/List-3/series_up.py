
# given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ...   1, 2, 3  ...  n}
def series_up(n):
    new_list = []
    number = 1
    count = 1

    i  = 0
    while i < (n*(n+1))/2:
        j = 0
        while j < count:
            new_list.append(number)
            number += 1
            i += 1
            j += 1
        count += 1
        number = 1
        i += 1

    return new_list

print(series_up(3))
print(series_up(4))
print(series_up(2))
