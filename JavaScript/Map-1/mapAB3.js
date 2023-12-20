
// modify and return the given map as follows:
// if exactly one of the keys 'a' or 'b' has a value in the map (but not both), set the other to have that same value in the map
const mapAB3 = (map) => {
    const myMap = new Map(Object.entries(map));
    
    if (myMap.has('a') && !myMap.has('b')) {
        myMap.set('b', myMap.get('a'));
    }

    if (!myMap.has('a') && myMap.has('b')) {
        myMap.set('a', myMap.get('b'));
    }

    return myMap;
};

console.log(mapAB3({'a': 'aaa', 'c': 'cake'}));
console.log(mapAB3({'b': 'bbb', 'c': 'cake'}));
console.log(mapAB3({'a': 'aaa', 'b': 'bbb', 'c': 'cake'}));
