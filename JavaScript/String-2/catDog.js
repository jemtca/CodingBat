
// return true if the string 'cat' and 'dog' appear the same number of times in the given string
const catDog = (str) => {
	let cat = 0;
	let dog = 0;

	for (let i = 0; i < str.length - 2; i++) {
		if (str.substring(i, i + 3) === 'dog') {
			dog++;
		}

		if (str.substring(i, i + 3) === 'cat') {
			cat++;
		}
	}

	return cat === dog;
};

console.log(catDog('catdog'));
console.log(catDog('catcat'));
console.log(catDog('1cat1cadodog'));
