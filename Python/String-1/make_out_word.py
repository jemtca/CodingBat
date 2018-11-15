
# given an "out" string length 4, such as "<<>>", and a word
# return a new string where the word is in the middle of the out string
def make_out_word(out, word):
    return out[:2] + word + out[2:]

print(make_out_word('<<>>' , 'Yay'))
print(make_out_word('<<>>', 'WooHoo'))
print(make_out_word('[[]]', 'word'))
