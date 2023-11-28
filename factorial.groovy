def factorial(n) {
    if (n == 0 || n == 1) {
        return 1
    } else {
        return n * factorial(n - 1)
    }
}

// Example usage
def result = factorial(5)
println "The factorial of 5 is: $result"
