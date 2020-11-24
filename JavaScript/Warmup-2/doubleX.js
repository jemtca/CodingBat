
// given a string, return true if the first instance of "x" in the string is immediately followed by another "x"
const doubleX = (str) => {

	let bool = false;
	let found = false;

	for (let i = 0; i < str.length - 1 && !found; i++) {
		if (str[i] === 'x') {
			found = true;
		}
		if (str[i] === 'x' && str[i + 1] === 'x') {
			bool = true;
		}
	}

	return bool;

};

console.log(doubleX('axxbb'));
console.log(doubleX('axaxax'));
console.log(doubleX('xxxxx'));
