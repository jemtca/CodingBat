
# given an array of scores, return true if each score is equal or greater than the one before
# the array will be length 2 or more
def scores_increasing(scores):
    b = True

    i = 0
    while i < len(scores) - 1 and b:
        if scores[i] > scores[i+1]:
            b = False
        i += 1

    return b

print(scores_increasing([1, 3, 4]))
print(scores_increasing([1, 3, 2]))
print(scores_increasing([1, 1, 4]))
