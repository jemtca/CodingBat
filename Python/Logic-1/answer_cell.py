
# your cell phone rings. Return true if you should answer it
# normally you answer, except in the morning you only answer if it is your mom calling
# in all cases, if you are asleep, you do not answer
def answer_cell(is_morning, is_mom, is_asleep):
    b = True
    
    if is_asleep or (is_morning and not is_mom):
        b = False
    
    return b

print(answer_cell(False, False, False))
print(answer_cell(False, False, True))
print(answer_cell(True, False, False))
