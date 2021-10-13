
// given a string and a non-empty word string
// return a string made of each char just before and just after every appearance of the word in the string
// ignore cases where there is no char before or after the word, and a char may be included twice if it is between two words
const wordEnds = (str, word) => {
	let newStr = '';

	for (let i = 0; i <= str.length - word.length; i++) {
		if (str.substring(i, i + word.length) === word && str.length > word.length) {
			if (i === 0) {
				newStr = newStr + str[i + word.length];
			} else if (i === str.length - word.length) {
				newStr = newStr + str[i - 1];
			} else {
				newStr = newStr + str[i - 1] + str[i + word.length];
			}
		} 
	}

	return newStr;
};

console.log(wordEnds('abcXY123XYijk', 'XY'));
console.log(wordEnds('XY123XY', 'XY'));
console.log(wordEnds('XY1XY', 'XY'));
