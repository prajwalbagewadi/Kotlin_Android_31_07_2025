# variable, datatypes and const in kotlin

## variables

Kotlin has two main keywords:

| Keyword | Meaning                       | Mutability |
| ------- | ----------------------------- | ---------- |
| var     | Variable (value can change)   | Mutable    |
| val     | Value (read-only, like final) | Immutable  |

## code :

```
fun main(){
    var num = 5; //Mutable Int
    println("num="+num);
    num += 10;
    println("updated num="+num);

    val num2 = 748; //Immutable Int (like final in Java)
    println("val num2="+num2);

    //error:02vardtconst.kt:8:5: error: 'val' cannot be reassigned.
    //num2 += 10;
    //println("updated val num2="+num2);
}
```

## Primitive Data types in kotlin:

| Type    | Description            | Example         |
| ------- | ---------------------- | --------------- |
| Int     | Integer (32-bit)       | val x = 10      |
| Long    | Long Integer (64-bit)  | val l = 100L    |
| Float   | Decimal (32-bit)       | val f = 10.5f   |
| Double  | Decimal (64-bit)       | val d = 20.5    |
| Boolean | true or false          | val flag = true |
| Char    | Single character       | val c = 'A'     |
| String  | Sequence of characters | val s = "hello" |

## code:

```
fun main(){
    //Integer
    var x = 10;
    println("Integer="+x);

    //Long
    var l = 1000L;
    println("Long="+l);

    //Float
    var f = 10.5f;
    println("float="+f);

    //Double
    var d = 25.7456;
    println("double="+d);

    //char
    var c = '$';
    println("char="+c);

    //String
    var s = "hello";
    println("string="+s);
}
```

## Constants in Kotlin

Kotlin has two ways to define constants:

## Using val (Runtime constants):

```
val pi = 3.1415  // Read-only but assigned at runtime
```

## Using const val (Compile-time constants — like static final in Java):

Must be declared at the top level, or inside an object (not inside functions).

```
const val MAX_USERS = 100
```

## code:

```
// top level Global constant
const val pi = 3.142;

fun main(){

    //constants
    val maxUser = 10;
    println("constant maxUser="+maxUser);

    println("const global PI="+pi);
}
```
