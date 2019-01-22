
# the squirrels in Palo Alto spend most of the day playing
# in particular, they play if the temperature is between 60 and 90 (inclusive)
# unless it is summer, then the upper limit is 100 instead of 90
# given an int temperature and a boolean isSummer, return true if the squirrels play and false otherwise
def squirrel_play(temp, is_summer):
    b = False

    if (is_summer and temp >= 60 and temp <= 100) or (not is_summer and temp >= 60 and temp <= 90):
        b = True

    return b

print(squirrel_play(70, False))
print(squirrel_play(95, False))
print(squirrel_play(95, True))
