
// given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string
// so "hixxxhi" yields 1
const late2 = (str) => {
	let count = 0;

	if (str.length > 1) {
		const strEnd = str.substring(str.length - 2);
		
		for (let i = 0; i < str.length - 2; i++) {
			if (strEnd === str.substring(i, i + 2)) {
				count++;
			}
		}
	}

	return count;
};

console.log(late2('hixxhi'));
console.log(late2('xaxxaxaxx'));
console.log(late2('axxxaaxx'));
