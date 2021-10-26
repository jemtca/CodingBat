
// given a string, look for a mirror image (backwards) string at both the beginning and end of the given string
// in other words, zero or more characters at the very begining of the given string,
// and at the very end of the string in reverse order (possibly overlapping)
// for example, the string 'abXYZba' has the mirror end 'ab'
const mirrorEnds = (str) => {
	let mirrorStr = '';

	for (let i = 0; i < str.length; i++) {
		if (str.substring(0, i + 1) === str.substring(str.length - (i + 1)).split('').reverse().join('')) {
			mirrorStr = str.substring(0, i + 1);
		}
	}

	return mirrorStr;
};

console.log(mirrorEnds('abXYZba'));
console.log(mirrorEnds('abca'));
console.log(mirrorEnds('aba'));
