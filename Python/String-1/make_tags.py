
# given tag and word strings, create the HTML string with tags around the word
def make_tags(tag, word):
    return '<' + tag + '>' + word + '</' + tag + '>'

print(make_tags('i', 'Yay'))
print(make_tags('i', 'Hello'))
print(make_tags('cite', 'Yay'))
