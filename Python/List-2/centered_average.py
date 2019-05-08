
# return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array
# if there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value
# use int division to produce the final average
# you may assume that the array is length 3 or more
def centered_average(nums):
    average = 0
    min = nums[0]
    max = nums[0]

    for x in range(len(nums)):
        if nums[x] > max:
            max = nums[x]
        elif nums[x] < min:
            min = nums[x]
        average = average + nums[x]

    average = (average-min-max) / (len(nums)-2)

    return int(average)

print(centered_average([1, 2, 3, 4, 100]))
print(centered_average([1, 1, 5, 5, 10, 8, 7]))
print(centered_average([-10, -4, -2, -4, -2, 0]))
