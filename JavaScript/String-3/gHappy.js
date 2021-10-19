
// we'll say that a lowercase 'g' in a string is 'happy' if there is another 'g' immediately to its left or right
// return true if all the g's in the given string are happy
const gHappy = (str) => {
	let happy = true;

	for (let i = 0; i < str.length; i++) {
		if (str[i] === 'g') {
			if (i > 0 && str[i - 1] === 'g') {
				happy = true;
			} else if (i < str.length - 1 && str[i + 1] === 'g') {
				happy = true;
			} else {
				happy = false;
			}
		}
	}

	return happy;
};

console.log(gHappy('xxggxx'));
console.log(gHappy('xxgxx'));
console.log(gHappy('xxggyygxx'));
