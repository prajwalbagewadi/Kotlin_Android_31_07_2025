# Understanding Kotlin (Kotlin Basics)

## what is Kotlin?

Kotlin is a modern programming language created by JetBrains (the makers of IntelliJ IDEA).
It runs on the Java Virtual Machine (JVM) and can work side-by-side with Java.

## Purpose of Kotlin?

Kotlin was made to fix the problems in Java and to make programming faster, safer, and more fun — especially for Android development.

## Advantages of Kotlin?

- It's like Java, but shorter and easier.

- It removes boilerplate code (like getters/setters, semicolons).

- It helps avoid common errors like null pointer exceptions.

- It is now the official language for Android apps (recommended by Google).

## Where Kotlin is Used:

- Android app development (most popular use)

- Backend development (with Spring Boot or Ktor)

- Desktop & Web apps

- Cross-platform apps using Kotlin Multiplatform

- Replacing or working with Java code

## helloworld :

extension: Kotlin source code files ".kt"

## basic structure of java program:

```
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## note:

Kotlin doesn’t require a class or static. It's much shorter and cleaner.

## basic structure of Kotlin program (hello world):

```
fun main(){
    println("Hello world. kotlin🚀!")
}
```

## how to compile and run:

```
compile:
kotlinc helloworld.kt -include-runtime -d helloworld.jar
```

```
run:
java -jar helloworld.jar
```
