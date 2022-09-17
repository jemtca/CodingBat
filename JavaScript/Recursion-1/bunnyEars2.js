
// we have bunnies standing in a line, numbered 1, 2, ...
// the odd bunnies (1, 3, ..) have the normal 2 ears
// the even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot
// recursively return the number of 'ears' in the bunny line 1, 2, ... n
const bunnyEars2 = (bunnies) => {
	if (bunnies === 0) {
		return 0;
	}

	return bunnies % 2 ? 2 + bunnyEars2(bunnies - 1) : 3 + bunnyEars2(bunnies - 1);
};

console.log(bunnyEars2(0));
console.log(bunnyEars2(1));
console.log(bunnyEars2(2));
