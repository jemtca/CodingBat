
// given a string, if the first or last chars are 'x', return the string without those 'x' chars
// otherwise return the string unchanged
const withoutX = (str) => {
	if (str.length > 1 && str.startsWith('x') && str.endsWith('x')) {
		return str.substring(1, str.length - 1);
	} else if (str.startsWith('x')) {
		return str.substring(1);
	} else if (str.endsWith('x')) {
		return str.substring(0, str.length - 1);
	} else {
		return str;
	}
};

console.log(withoutX('xHix'));
console.log(withoutX('xHi'));
console.log(withoutX('Hxix'));
