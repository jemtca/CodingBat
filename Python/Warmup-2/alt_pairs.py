
# this function return a string made of the chars at indexes 0,1,5,6,9,10,...
def alt_pairs(str):
	s = ""

	for x in range(0,len(str),4):
		if x < len(str)-1:
			s = s + str[x] + str[x+1]
		else:
			s = s + str[x]

	return s

print(alt_pairs("kitten"))
print(alt_pairs("Chocolate"))
print(alt_pairs("CodingHorror"))
