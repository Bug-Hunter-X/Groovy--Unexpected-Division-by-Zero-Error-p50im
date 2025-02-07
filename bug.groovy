```groovy
def methodWithUnexpectedBehavior(int a, int b) {
  if (a == 0) {
    return b / a // This line will cause a division by zero error
  } else {
    return a + b
  }
}

println methodWithUnexpectedBehavior(0, 5) //Exception thrown
```