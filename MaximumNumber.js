function findMax(arr) {
    if (arr.length === 0) {
        return undefined; // or handle empty array case as needed
    }

    let max = arr[0]; // Assume the first element is the max initially

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i]; // Update max if current element is greater
        }
    }

    return max;
}

// Example usage:
const numbers = [3, 5, 7, 2, 8, 9, 1];
const maxNumber = findMax(numbers);
console.log('The maximum number is:', maxNumber);
