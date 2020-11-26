
// given a non-empty string like "Code" return a string like "CCoCodCode"
const stringSplosion = (str) => {

	let newStr = '';

	for (let i = 0; i < str.length; i++) {
		newStr = newStr + str.substring(0, i+1);
	}

	return newStr;

};

console.log(stringSplosion('Code'));
console.log(stringSplosion('abc'));
console.log(stringSplosion('ab'));
