
# this function return true (trouble) if two monkeys are smiling or two monkeys are not smiling
def monkey_trouble(a_smile, b_smile):
	b = False

	if (a_smile and b_smile) or (not a_smile and not b_smile):
		b = True;

	return b


print(monkey_trouble(True, True))
print(monkey_trouble(False, False))
print(monkey_trouble(True, False))
