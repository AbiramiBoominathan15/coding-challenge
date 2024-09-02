function findMinMax(arr) {
    if (arr.length === 0) {
        throw new Error("Array cannot be empty");
    }

    let min = arr[0];
    let max = arr[0];

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];
        }
        if (arr[i] > max) {
            max = arr[i];
        }
    }

    return { min, max };
}

console.log(findMinMax([3, 1, 4, 1, 5, 9, 2, 6])); 
