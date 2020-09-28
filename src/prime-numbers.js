function isPrime(n) {
    if (n < 2) return false
    for (let i = 2; i < n/2; i++) {
        if (n % i == 0) {
            return false;
        }

    }
    return true
}

const example = [1, 2, 34, 5, 6, 77, 25, 7, 8, 9, 97]
const prime = example.filter(isPrime)
console.log(prime)

/*
Write a function that checks if a number is a prime

 */