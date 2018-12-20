
# start with 2 int lists, a and b, of any length. Return how many of the lists have 1 as their first element
def start1(a, b):
    count = 0

    if len(a) > 0 and a[0] == 1:
        count += 1
    if len(b) > 0 and b[0] == 1:
        count += 1
    
    return count

print(start1([1, 2, 3], [1, 3]))
print(start1([7, 2, 3], [1]))
print(start1([1, 2], []))
