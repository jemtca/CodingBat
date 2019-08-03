
# we have an array of heights, representing the altitude along a walking trail
# given start/end indexes into the array, return the sum of the changes for a walk beginning at the start index and ending at the end index, however increases in height count double
def sum_heights2(heights, start, end):
    x = 0

    i = start
    while i < end:
        if heights[i] > heights[i+1]:
            x = x + (heights[i] - heights[i+1])
        else:
            x = x + ((heights[i+1] - heights[i]) * 2)
        i += 1

    return x

print(sum_heights2([5, 3, 6, 7, 2], 2, 4))
print(sum_heights2([5, 3, 6, 7, 2], 0, 1))
print(sum_heights2([5, 3, 6, 7, 2], 0, 4))
