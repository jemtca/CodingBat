
// given a string and a non-empty word string
// return a version of the original String where all chars have been replaced by pluses ('+')
// except for appearances of the word string which are preserved unchanged
const plusOut = (str, word) => {
	let newStr = '';

	if (str.includes(word)) {
		newStr = str.replaceAll(word, '--');

		for (let i = 0; i < str.length; i++) {
			if (str[i] !== '^') {
				newStr = newStr.replace(str.substring(i, i + 1), '+');
			}
		}
	}

	newStr = newStr.replaceAll('--', word);

	return newStr;
};

console.log(plusOut('12xy34', 'xy'));
console.log(plusOut('12xy34', '1'));
console.log(plusOut('12xy34xyabcxy','xy'));
