
# this function return true if the given string begins with "mix", except the 'm' can be anything
def mix_start(str):
	
	b = False

	if len(str) >= 3 and str[1:3] == "ix":
		b = True

	return b

print(mix_start("mix snacks"))
print(mix_start("pix snacks"))
print(mix_start("piz snacks"))
