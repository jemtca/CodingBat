
# given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends with sub and return its length
def str_dist(str, sub):
	if not str or (len(str) == len(sub) and str != sub):
		return 0

	if len(str) >= len(sub) and str[:len(sub)] == sub and str[len(str)-len(sub):] == sub:
		return len(str)
	
	if str[:len(sub)] == sub and str[len(str)-len(sub):] != sub:
		return str_dist(str[:len(str)-1], sub)
	elif str[:len(sub)] != sub and str[len(str)-len(sub):] == sub:
		return str_dist(str[1:], sub)
	else:
		return str_dist(str[1:len(str)-1], sub)

print(str_dist('catcowcat', 'cat'))
print(str_dist('catcowcat', 'cow'))
print(str_dist('cccatcowcatxx', 'cat'))
