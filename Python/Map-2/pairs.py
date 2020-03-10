
# given an array of non-empty strings, create and return a Map<String, String> as follows: for each string add its first character as a key with its last character as the value
def pairs(str):
    d = {}

    for x in str:
        d[x[0]] = x[len(x)-1] 

    return d

print(pairs(['code', 'bug']))
print(pairs(['man', 'moon', 'main']))
print(pairs(['man', 'moon', 'good', 'night']))
