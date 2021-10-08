
// return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone
// so 'ab*cd' yields 'ad' and 'ab**cd' also yields 'ad'
const startOut = (str) => {
	let newStr = '';

	for (let i = 0; i < str.length; i++) {
		if (str[i] === '*' || i > 0 && str[i - 1] === '*') {
			continue;
		}

		if (i < str.length - 1 && str[i + 1] === '*') {
			continue;
		}

		newStr = newStr + str[i];
	}

	return newStr;
};

console.log(startOut('ab*cd'));
console.log(startOut('ab**cd'));
console.log(startOut('sm*eilly'));
