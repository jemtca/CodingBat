
# given an array of scores, return true if there are scores of 100 next to each other in the array
# the array length will be at least 2
def scores100(scores):
    b = False

    i = 0
    while i < len(scores) - 1 and not b:
        if scores[i] == 100 and scores[i+1] == 100:
            b = True
        i += 1

    return b

print(scores100([1, 100, 100]))
print(scores100([1, 100, 99, 100]))
print(scores100([100, 1, 100, 100]))
