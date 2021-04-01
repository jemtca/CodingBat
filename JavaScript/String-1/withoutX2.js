
// given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars
// otherwise return the string unchanged
const withoutX2 = (str) => {
	if (str.length === 0 || str.length === 1 && str[0] === 'x') {
		return '';
	} else if (str.length === 1 && str[0] !== 'x') {
		return str;
	} else {
		return str.substring(0, 2).replace('x', '') + str.substring(2);
	}
};

console.log(withoutX2('xHi'));
console.log(withoutX2('Hxi'));
console.log(withoutX2('Hi'));
