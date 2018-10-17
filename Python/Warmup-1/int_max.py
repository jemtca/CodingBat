
# this function return the largest value of the three given int values
def int_max(a, b , c):
	max = 0

	if a > b and a > c:
		max = a
	if b > a and b > c:
		max = b
	if c > a and c > b:
		max = c

	return max

print(int_max(1, 2, 3))
print(int_max(1, 3, 2))
print(int_max(3, 2, 1))
