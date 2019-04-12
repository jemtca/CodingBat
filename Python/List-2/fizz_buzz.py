
# consider the series of numbers beginning at start and running up to but not including end, so for example start=1 and end=5 gives the series 1, 2, 3, 4
# return a new String[] array containing the string form of these numbers, except for multiples of 3, use "Fizz" instead of the number,
# for multiples of 5 use "Buzz", and for multiples of both 3 and 5 use "FizzBuzz"
def fizz_buzz(start, end):
    new_list = []

    for x in range(1, end-start+1):
        if x % 3 == 0 and x % 5 == 0:
            new_list.append('FizzBuzz')
        elif x % 3 == 0:
            new_list.append('Fizz')
        elif x % 5 == 0:
            new_list.append('Buzz')
        else:
            new_list.append(x)

    return new_list

print(fizz_buzz(1, 6))
print(fizz_buzz(1, 8))
print(fizz_buzz(1, 11))
