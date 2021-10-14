
// given a string, count the number of words ending in 'y' or 'z'
// so the 'y' in 'heavy' and the 'z' in 'fez' count, but not the 'y' in 'yellow'
// we'll say that a 'y' or 'z' is at the end of a word if there is not an alphabetic letter immediately following it
const countYZ = (str) => {
	let count = 0;

	for (let i = 0; i < str.length; i++) {
		if (i < str.length - 1) {
			if ((str[i].toLowerCase() === 'y' || str[i].toLowerCase() === 'z') && !isNaN(str[i + 1])) {
				count++;
			}
		} else {
			if (str[i].toLowerCase() === 'y' || str[i].toLowerCase() === 'z') {
				count++;
			}
		}
	}

	return count;
};

console.log(countYZ('fez day'));
console.log(countYZ('day fez'));
console.log(countYZ('day fyyyz'));
