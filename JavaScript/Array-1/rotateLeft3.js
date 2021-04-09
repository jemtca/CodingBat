
// given an array of ints length 3, return an array with the elements 'rotated left' so {1, 2, 3} yields {2, 3, 1}
const rotateLeft3 = (nums) => {
    const array = [];
    
    array.push(nums[1]);
    array.push(nums[2]);
    array.push(nums[0]);
    
    return array;
};

console.log(rotateLeft3([1, 2, 3]));
console.log(rotateLeft3([5, 11, 9]));
console.log(rotateLeft3([7, 0, 0]));
