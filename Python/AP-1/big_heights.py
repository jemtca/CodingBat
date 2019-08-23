
# we have an array of heights, representing the altitude along a walking trail
# given start/end indexes into the array, return the number of "big" steps for a walk starting at the start index and ending at the end index
# we'll say that step is big if it is 5 or more up or down. The start end end index will both be valid indexes into the array with start <= end
def big_heights(heights, start, end):
    max = 0

    i = start
    while i < end:
        if abs(heights[i] - heights[i+1]) >= 5:
            max += 1
        i += 1

    return max

print(big_heights([5, 3, 6, 7, 2], 2, 4))
print(big_heights([5, 3, 6, 7, 2], 0, 1))
print(big_heights([5, 3, 6, 7, 2], 0, 4))
