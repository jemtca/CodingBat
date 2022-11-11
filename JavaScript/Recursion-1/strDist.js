
// given a string and a non-empty substring sub
// compute recursively the largest substring which starts and ends with sub and return its length
const strDist = (str, sub) => {
    if (!str || (str.length === sub.length && str !== sub)) {
        return 0;
    }

    if (str.length >= sub.length && str.substring(0, sub.length) !== sub) {
        return strDist(str.substring(1), sub);
    }

    if (str.length >= sub.length && str.substring(str.length - sub.length) !== sub) {
        return strDist(str.substring(0, str.length - 1), sub);
    }

    return str.length;
};

console.log(strDist('catcowcat', 'cat'));
console.log(strDist('catcowcat', 'cow'));
console.log(strDist('cccatcowcatxx', 'cat'));
