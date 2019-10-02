
# given a string, compute recursively a new string where all appearances of "pi" have been replaced by "3.14"
def change_pi(str):
    s = ''
    
    if not str:
        return s
    if len(str) > 1 and str[:2] == 'pi':
        return s + '3.14' + change_pi(str[2:])
    else:
        return s + str[0] + change_pi(str[1:])

print(change_pi('xpix'))
print(change_pi('pipi'))
print(change_pi('pip'))
