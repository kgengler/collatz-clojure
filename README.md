# collatz-clojure

Takes a number and calculates the number of steps to reach 1 using steps 
outlined in the Collatz Conjecture.

see https://en.wikipedia.org/wiki/Collatz_conjecture

## Build

`lein compile`

`lein uberjar`

## Run

`java -jar target/uberjar/collatz-clojure-${VERSION}-standalone.jar ${INPUT}`

## Example Usage

```
$ lein compile
$ lein uberjar
Compiling collatz-clojure.core
Created target/uberjar/collatz-clojure-0.1.0-SNAPSHOT.jar
Created target/uberjar/collatz-clojure-0.1.0-SNAPSHOT-standalone.jar
$ java -jar target/uberjar/collatz-clojure-0.1.0-SNAPSHOT-standalone.jar 8
3
```

