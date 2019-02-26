
# given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive)
# we'll say that a y or z is at the end of a word if there is not an alphabetic letter immediately following it
def count_yz(str):
    count = 0

    for x in range(len(str)):
        if x < len(str)-1:
            if (str[x].lower() == 'y' and not str[x+1].isalpha() ) or (str[x].lower() == 'z' and not str[x+1].isalpha()):
                count += 1
        else:
            if str[x].lower() == 'y' or str[x].lower() == 'z':
                count += 1

    return count

print(count_yz('fez day'))
print(count_yz('day fez'))
print(count_yz('day fyyyz'))
