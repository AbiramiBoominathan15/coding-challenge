function reverseString(str) {
    const charArray = [];
    
    for (let i = str.length - 1; i >= 0; i--) {
        charArray.push(str[i]);
    }
    
    return charArray.join('');
}

console.log(reverseString("JavaScript")); 
