
// we'll say that a 'triple' in a string is a char appearing three times in a row
// return the number of triples in the given string
// the triples may overlap
const countTrples = (str) => {
	let triples = 0;

	for (let i = 0; i < str.length; i++) {
		if (i < str.length - 2 && str[i] === str[i + 1] && str[i] === str[i + 2]) {
			triples++;
		}
	}

	return triples;
};

console.log(countTrples('abcXXXabc'));
console.log(countTrples('xxxabyyyycd'));
console.log(countTrples('a'));
