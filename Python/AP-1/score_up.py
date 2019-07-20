
# the "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}. the "answers" array contains a student's answers, with "?" representing a question left blank
# the two arrays are not empty and are the same length
# return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer
def score_up(key, answers):
    x = 0

    i = 0
    while i < len(key):
        if key[i] == answers[i]:
            x = x + 4
        elif key[i] != answers[i] and answers[i] != '?':
            x = x - 1
        i += 1

    return x

print(score_up(["a", "a", "b", "b"], ["a", "c", "b", "c"]))
print(score_up(["a", "a", "b", "b"], ["a", "a", "b", "c"]))
print(score_up(["a", "a", "b", "b"], ["a", "a", "b", "b"]))
