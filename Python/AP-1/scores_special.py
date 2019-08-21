
# given two arrays, A and B, of non-negative int scores
# A "special" score is one which is a multiple of 10, such as 40 or 90
# return the sum of largest special score in A and the largest special score in B
def scores_special(a, b):
    max_a = 0
    max_b = 0

    for x in range(len(a)):
        if a[x] % 10 == 0 and a[x] > max_a:
            max_a = a[x]
    
    for x in range(len(b)):
        if b[x] % 10 == 0 and b[x] > max_b:
            max_b = b[x]

    return max_a + max_b

print(scores_special([12, 10, 4], [2, 20, 30]))
print(scores_special([20, 10, 4], [2, 20, 10]))
print(scores_special([12, 11, 4], [2, 20, 31]))
