
# start with two arrays of strings, A and B, each with its elements in alphabetical order and without duplicates
# return a new array containing the first N elements from the two arrays
# the result array should be in alphabetical order and without duplicates
# A and B will both have a length which is N or more
def merge_two(a, b, n):
    new_list = []
    one = 0
    two = 0

    for _ in range(n):
        if a[one] < b[two]:
            new_list.append(a[one])
            one += 1
        elif a[one] > b[two]:
            new_list.append(b[two])
            two += 1
        else:
            new_list.append(a[one])
            one += 1
            two += 1

    return new_list

print(merge_two(['a', 'c', 'z'], ['b', 'f', 'z'], 3))
print(merge_two(['a', 'c', 'z'], ['c', 'f', 'z'], 3))
print(merge_two(['f', 'g', 'z'], ['c', 'f', 'g'], 3))
