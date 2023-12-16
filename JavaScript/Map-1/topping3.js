
// given a map of food keys and topping values, modify and return the map as follows:
// if the key 'potato' has a value, set that as the value for the key 'fries'
// if the key 'salad' has a value, set that as the value for the key 'spinach'
const topping3 = (map) => {
    const myMap = new Map(Object.entries(map));

    if (myMap.has('potato')) {
        myMap.set('fries', myMap.get('potato'));
    }

    if (myMap.has('salad')) {
        myMap.set('spinach', myMap.get('salad'));
    }

    return myMap;
};

console.log(topping3({'potato': 'ketchup'}));
console.log(topping3({'potato': 'butter'}));
console.log(topping3({'salad': 'oil', 'potato': 'ketchup'}));
