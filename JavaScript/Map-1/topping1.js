
// given a map of food keys and topping values, modify and return the map as follows: if the key 'ice cream' is present, set its value to 'cherry'
// in all cases, set the key 'bread' to have the value 'butter'
const topping1 = (map) => {
    const myMap = new Map(Object.entries(map));

    if (myMap.has('ice cream')) {
        myMap.set('ice cream', 'cherry');
    }

    myMap.set('bread', 'butter');

    return myMap
};

console.log(topping1({'ice cream': 'peanuts'}));
console.log(topping1({}));
console.log(topping1({'pancake': 'syrup'}));
