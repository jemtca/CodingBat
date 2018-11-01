
# this function return a new string made of every other char starting with the first
def string_bits(str):
	s = ""

	for x in range(0,len(str),2):
		s = s + str[x]

	return s

print(string_bits("Hello"))
print(string_bits("Hi"))
print(string_bits("Heeololeo"))
