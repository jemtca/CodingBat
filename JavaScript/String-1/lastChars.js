
// given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so 'yo' and 'java' yields 'ya'
// if either string is length 0, use '@' for its missing char
const lastChars = (a, b) => {
	let str = '';

	if (a.length === 0 && b.length === 0) {
		str = '@@';
	} else if (a.length === 0 && b.length !== 0) {
		str = '@' + b[b.length - 1];
	} else if (a.length !== 0 && b.length === 0) {
		str = a[0] + '@';
	} else {
		str = a[0] + b[b.length - 1];
	}

	return str;
};

console.log(lastChars('last', 'chars'));
console.log(lastChars('yo', 'java'));
console.log(lastChars('hi', ''));
