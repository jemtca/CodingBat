
# this function return true (trouble) if a loud talking parrot is talking and it is before 7 or it is after 20
def parrot_trouble(talking, hour):
	b = False

	if talking and (hour < 7 or hour > 20):
		b = True

	return b

print(parrot_trouble(True, 6))
print(parrot_trouble(True, 7))
print(parrot_trouble(False, 6))
