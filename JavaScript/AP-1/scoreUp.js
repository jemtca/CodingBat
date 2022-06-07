
// the 'key' array is an array containing the correct answers to an exam, like {'a', 'a', 'b', 'b'}
// the 'answers' array contains a student's answers, with '?' representing a question left blank
// the two arrays are not empty and are the same length
// return the score for this array of answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer
const scoreUp = (key, answers) => {
	let score = 0;

	for (let i = 0; i < key.length; i++) {
		if (answers[i] === '?') {
			continue;
		} else if (key[i] === answers[i]) {
			score = score + 4;
		} else {
			score = score - 1;
		}
	}

	return score;
};

console.log(scoreUp(['a', 'a', 'b', 'b'], ['a', 'c', 'b', 'c']));
console.log(scoreUp(['a', 'a', 'b', 'b'], ['a', 'a', 'b', 'c']));
console.log(scoreUp(['a', 'a', 'b', 'b'], ['a', 'a', 'b', 'b']));
