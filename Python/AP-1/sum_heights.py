
# we have an array of heights, representing the altitude along a walking trail
# given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index
# for example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6
# the start end end index will both be valid indexes into the array with start <= end
def sum_heights(heights, start, end):
    sum = 0

    i = start
    while i < end:
        if heights[i] < heights[i+1]:
            sum = sum + (heights[i+1] - heights[i])
        elif heights[i] > heights[i+1]:
            sum = sum + (heights[i] - heights[i+1])
        i += 1

    return sum

print(sum_heights([5, 3, 6, 7, 2], 2, 4))
print(sum_heights([5, 3, 6, 7, 2], 0, 1))
print(sum_heights([5, 3, 6, 7, 2], 0, 4))
