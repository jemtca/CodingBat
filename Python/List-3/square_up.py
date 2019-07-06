
# given n>=0, create an array length n*n with the following pattern
# shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups)
def square_up(n):
    new_list = []
    temp = 1
    temp2 = n

    for _ in range(n*n):
        new_list.append(0)
    
    index = len(new_list) - 1
    
    i = 0
    while i < n:
        j = temp2
        while j > 0:
            new_list[index] = temp
            index -= 1
            temp += 1
            j -= 1
        temp = 1
        temp2 -= 1
        index = index - i
        i += 1

    return new_list

print(square_up(3))
print(square_up(2))
print(square_up(4))
