
// given a map of food keys and their topping values, modify and return the map as follows:
// if the key 'ice cream' has a value, set that as the value for the key 'yogurt' also
// if the key 'spinach' has a value, change that value to 'nuts'
const topping2 = (map) => {
    const myMap = new Map(Object.entries(map));

    if (myMap.has('ice cream')) {
        myMap.set('yogurt', myMap.get('ice cream'));
    }

    if (myMap.has('spinach')) {
        myMap.set('spinach', 'nuts');
    }

    return myMap;
};

console.log(topping2({'ice cream': 'cherry'}));
console.log(topping2({'spinach': 'dirt', 'ice cream': 'cherry'}));
console.log(topping2({'yogurt': 'salt'}));
