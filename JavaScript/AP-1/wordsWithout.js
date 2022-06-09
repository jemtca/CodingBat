
// given an array of strings, return a new array without the strings that are equal to the target string
// one approach is to count the occurrences of the target string,
// make a new array of the correct length, and then copy over the correct strings
const wordsWithout = (words, target) => {
	let newArray = [];

	for (let i = 0; i < words.length; i++) {
		if (words[i] !== target) {
			newArray.push(words[i]);
		}
	}

	return newArray;
};

console.log(wordsWithout(['a', 'b', 'c', 'a'], 'a'));
console.log(wordsWithout(['a', 'b', 'c', 'a'], 'b'));
console.log(wordsWithout(['a', 'b', 'c', 'a'], 'c'));
