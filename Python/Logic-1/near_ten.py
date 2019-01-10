
# given a non-negative number "num", return true if num is within 2 of a multiple of 10
def near_ten(num):
    b = False
    
    if num >= 0:
        if num % 10 <= 2 or num % 10 >= 8:
            b = True
    
    return b

print(near_ten(12))
print(near_ten(17))
print(near_ten(19))
