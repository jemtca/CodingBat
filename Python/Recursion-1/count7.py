
# given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2
def count7(n):
    count = 0

    if int(n) == 0:
        return count
    if int(n % 10) == 7:
        count += 1
    
    return count + count7(n/10)

print(count7(717))
print(count7(7))
print(count7(1))
