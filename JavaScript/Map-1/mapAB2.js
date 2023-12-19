
// modify and return the given map as follows: if the keys 'a' and 'b' are both in the map and have equal values, remove them both
const mapAB2 = (map) => {
    const myMap = new Map(Object.entries(map));

    if ((myMap.has('a') && myMap.has('b')) && (myMap.get('a') === myMap.get('b'))) {
        myMap.delete('a');
        myMap.delete('b');
    }

    return myMap;
};

console.log(mapAB2({'a': 'aaa', 'b': 'aaa', 'c': 'cake'}));
console.log(mapAB2({'a': 'aaa', 'b': 'bbb'}));
console.log(mapAB2({'a': 'aaa', 'b': 'bbb', 'c': 'aaa'}));
