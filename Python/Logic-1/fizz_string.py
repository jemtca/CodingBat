
# given a string str, if the string starts with "f" return "Fizz"
# if the string ends with "b" return "Buzz"
# if both the "f" and "b" conditions are true, return "FizzBuzz"
# in all other cases, return the string unchanged
def fizz_string(str):
    new_string = ''

    if str[:1].lower() == 'f' and str[len(str)-1].lower() == 'b':
        new_string = 'FizzBuzz'
    elif str[:1].lower() == 'f':
        new_string = 'Fizz'
    elif str[len(str)-1] == 'b':
        new_string = 'Buzz'
    else:
        new_string = str

    return new_string

print(fizz_string('fiz'))
print(fizz_string('dib'))
print(fizz_string('fiB'))
