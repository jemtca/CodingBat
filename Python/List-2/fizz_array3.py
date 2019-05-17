
# given start and end numbers, return a new array containing the sequence of integers from start up to but not including end
# so start=5 and end=10 yields {5, 6, 7, 8, 9}
def fizz_array3(start, end):
    new_list = []
    number = start

    for x in range(start, end):
        new_list.append(x)
        number += 1

    return new_list

print(fizz_array3(5, 10))
print(fizz_array3(11, 18))
print(fizz_array3(1, 3))
