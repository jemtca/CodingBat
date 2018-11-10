
# given a non-empty string like "Code" return a string like "CCoCodCode"
def string_splosion(str):
    s = ""

    for x in range(len(str)):
        s = s + str[:x+1]

    return s

print(string_splosion("Code"))
print(string_splosion("abc"))
print(string_splosion("ab"))
