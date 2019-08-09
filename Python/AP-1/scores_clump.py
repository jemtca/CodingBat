
# given an array of scores sorted in increasing order, return true if the array contains 3 adjacent scores that differ from each other by at most 2
def scores_clumps(scores):
    b = False

    #print(len(scores))

    i = 0
    while i < len(scores) - 2 and not b:
        if (abs(scores[i] - scores[i+1]) < 3) and (abs(scores[i] - scores[i+2]) < 3) and (abs(scores[i+1] - scores[i+2]) < 3):
            b = True
        i += 1
    
    return b

print(scores_clumps([3, 4, 5]))
print(scores_clumps([3, 4, 6]))
print(scores_clumps([1, 3, 5, 5]))
