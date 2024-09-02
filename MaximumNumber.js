function findMax(arr) {
    if (arr.length === 0) {
        return undefined; 
    }

    let max = arr[0]; 

    for (let i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i]; 
        }
    }

    return max;
}

const numbers = [3, 5, 7, 2, 8, 9, 1];
const maxNumber = findMax(numbers);
console.log('The maximum number is:', maxNumber);
