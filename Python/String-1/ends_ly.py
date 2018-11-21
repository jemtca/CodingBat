
# given a string, return true if it ends in "ly"
def ends_ly(str):
    return True if str[-2:] == 'ly' else False

print(ends_ly('oddly'))
print(ends_ly('y'))
print(ends_ly('oddy'))
