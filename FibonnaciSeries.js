function fibonacciSequence(numTerms) {
    if (numTerms <= 0) return []; 
    if (numTerms === 1) return [0]; 

    const sequence = [0, 1];

    for (let i = 2; i < numTerms; i++) {
        const nextTerm = sequence[i - 1] + sequence[i - 2];
        sequence.push(nextTerm);
    }

    return sequence;
}

console.log(fibonacciSequence(10));
