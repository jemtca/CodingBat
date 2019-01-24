
# given an int n, return the string form of the number followed by "!"
# so the int 6 yields "6!"
# except if the number is divisible by 3 use "Fizz!" instead of the number
# and if the number is divisible by 5 use "Buzz!"
# and if divisible by both 3 and 5, use "FizzBuzz!"
def fizz_string2(n):
    new_string = str(n) + '!'

    if n % 3 == 0 and n % 5 == 0:
        new_string = 'FizzBuzz!'
    elif n % 3 == 0:
        new_string = 'Fizz!'
    elif n % 5 == 0:
        new_string = 'Buzz!'

    return new_string

print(fizz_string2(1))
print(fizz_string2(2))
print(fizz_string2(3))
