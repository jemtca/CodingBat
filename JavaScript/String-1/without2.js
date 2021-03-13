
// given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning
// so 'HelloHe' yields 'lloHe'
// the substring may overlap with itself
// so 'Hi' yields '
// otherwise, return the original string unchanged
const without2 = (str) => {
	if (str.length > 1 && (str.substring(0, 2) === str.substring(str.length - 2, str.length)) {
		str = str.substring(2);
	}

	return str;
};

console.log(without2('HelloHe'));
console.log(without2('HelloHi'));
console.log(without2('Hi'));
