function isPalindrome(str) {
    const normalizedStr = str
        .toLowerCase()
        .replace(/[^a-z0-9]/gi, '');
    
    const reversedStr = normalizedStr.split('').reverse().join('');
    
    return normalizedStr === reversedStr;
}

console.log(isPalindrome("A man, a plan, a canal, Panama")); 
