
# given an array of scores, compute the int average of the first half and the second half, and return whichever is larger
# we'll say that the second half begins at index length/2
# the array length will be at least 2
def scores_average(scores):
    x1 = 0
    x2 = 0
    count = 0
    middle = (int)(len(scores)/2)
    
    i = 0
    while i < middle:
        x1 = x1 + scores[i]
        count += 1
        i += 1
    
    x1 = (int)(x1 / count)
    count = 0

    i = middle
    while i < len(scores):
        x2 = x2 + scores[i]
        count += 1
        i += 1
    
    x2 = (int)(x2 / count)

    return x1 if x1 > x2 else x2

print(scores_average([2, 2, 4, 4]))
print(scores_average([4, 4, 4, 2, 2, 2]))
print(scores_average([3, 4, 5, 1, 2, 3]))
