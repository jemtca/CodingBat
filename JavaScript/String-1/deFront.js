
// given a string, return a version without the first 2 chars
// except keep the first char if it is 'a' and keep the second char if it is 'b'
// the string may be any length
const deFront = (str) => {
	let newStr = '';

	if (str.length === 1 && str[0] === 'a') {
		newStr = str;
	} else if (str.length >= 2) {
		if (str[0] === 'a' && str[1] === 'b') {
			newStr = str;
		} else if (str[0] === 'a' && str[1] !== 'b') {
			newStr = str[0] + str.substring(2);
		} else if (str[0] !== 'a' && str[1] === 'b') {
			newStr = str.substring(1);
		} else {
			newStr = str.substring(2);
		}
	}

	return newStr;
};

console.log(deFront('Hello'));
console.log(deFront('java'));
console.log(deFront('away'));
