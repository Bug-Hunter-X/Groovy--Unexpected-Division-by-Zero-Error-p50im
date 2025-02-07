```groovy
def methodWithUnexpectedBehavior(int a, int b) {
  if (a == 0) {
    return 0 // Or throw an exception: throw new IllegalArgumentException("Cannot divide by zero")
  } else {
    return a + b
  }
}

println methodWithUnexpectedBehavior(0, 5) //Prints 0
println methodWithUnexpectedBehavior(5, 2) //Prints 7
```