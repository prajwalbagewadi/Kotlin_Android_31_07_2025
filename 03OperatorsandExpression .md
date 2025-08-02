# Operators and Expression in kotlin

## Arithmetic Operators

Same as Java — used for basic math.

| Operator  | Description    | Example |
| --------- | -------------- | ------- |
| +         | Addition       | a + b   |
| -         | Subtraction    | a - b   |
| \*        | Multiplication | a \* b  |
| /         | Division       | a / b   |
| % Modulus | (remainder)    | a % b   |

## code:

```
fun main(){
    var a = 10;
    var b = 20;
    //Arithmetic
    println("addition="+(a+b));
    println("substraction="+(b-a));
    println("multiplication="+(b*a));
    println("division="+(b/a));
    println("(remainder) modulus="+(b%a));
}
```

## Assignment Operators

| Operator | Description          | Example  |
| -------- | -------------------- | -------- |
| =        | Assign Value         | a = 10   |
| +=       | Add and Assign       | a += 10  |
| -=       | Substract and Assign | a -= 10  |
| \*=      | Multiply and Assign  | a \*= 10 |
| /=       | Divide and Assign    | a /= 10  |
| %=       | modulus and Assign   | a %= 10  |

## code:

```
fun main(){
    //Assignment
    var num=0;
    num = 5;
    println("Assign value="+num);
    num += 5;
    println("Add and Assign="+num);
    num -= 5;
    println("Sub and Assign="+num);
    num *= 5;
    println("Multiple and Assign="+num);
    num /= 5;
    println("divide and Assign="+num);
    num %= 5;
    println("Modulus and Assign="+num);
}
```

## Comparison Operators

Used to compare values — result is Boolean.

| Operator | Description      | Example |
| -------- | ---------------- | ------- |
| ==       | Equal to         | a == b  |
| !=       | Not Equal to     | a != b  |
| >        | Greater than     | a > b   |
| <        | less than        | a < b   |
| >=       | Greater or Equal | a >= b  |
| <=       | less or Equal    | a <= b  |

## code:

```
fun main(){
    //Comparison
    var num1 = 10;
    var num2 = 20;
    println("Equal to="+(num1==num2));
    println("Not Equal="+(num1!=num2));
    println("Greater than="+(num2>num1));
    println("less than="+(num1<num2));
    println("Greater or Equal="+(num1>=num2));
    println("less or Equal="+(num1<=num2));
}
```

## Logical Operators

| Operator | Description | Example      |
| -------- | ----------- | ------------ |
| &&       | Logical And | a>2 && b<5   |
| \|\|     | Logical OR  | a>2 \|\| b<5 |
| !        | Logical Not | !(a>2)       |

## code:

```
fun main(){
    //Logical
    var x = 3;
    println("Logical And="+(x>2 && x<5));
    x = 10;
    println("Logical OR="+(x>2 || x<5));
    println("Logical Not="+(!(x<5)));
}
```

## Unary Operators

| Operator | Description | Example    |
| -------- | ----------- | ---------- |
| +        | Unary plus  | +a         |
| -        | Unary minus | -a         |
| ++       | Increment   | a++ or ++a |
| --       | Decrement   | a-- or --a |
| !        | Logical NOT | !true      |

## code:

```
fun main(){
    //Unary
    var pos = 10;
    var neg = 23;
    +pos; //positive var
    -neg; //negitive var
    println("pos="+pos);
    println("neg="+neg);
    pos++;
    println("Increament pos="+pos);
    pos--;
    println("Decreament pos="+pos);
    var f = true;
    println("Not opr="+!f)
}
```

## Bitwise Operators (Kotlin only supports named functions)

| Java Operator | Kotlin Equivalent | Example   |
| ------------- | ----------------- | --------- |
| a & b         | a.and(b)          | a.and(b)  |
| a\|\|b        | a.or(b)           | a.or(b)   |
| a ^ b         | a.xor(b)          | a.xor(b)  |
| ~a            | a.inv()           | a.inv()   |
| a << b        | a.shl(b)          | a.shl(b)  |
| a >> b        | a.shr(b)          | a.shr(b)  |
| a >>> b       | a.ushr(b)         | a.ushr(b) |

| 8   | 4   | 2   | 1   | Equals |
| --- | --- | --- | --- | ------ |
| 0   | 0   | 0   | 1   | = 1    |
| 0   | 0   | 1   | 0   | = 2    |
| 0   | 0   | 1   | 1   | = 3    |
| 0   | 1   | 0   | 0   | = 4    |
| 0   | 1   | 0   | 1   | = 5    |
| 0   | 1   | 1   | 0   | = 6    |
| 0   | 1   | 1   | 1   | = 7    |
| 1   | 0   | 0   | 0   | = 8    |
| 1   | 0   | 0   | 1   | = 9    |
| 1   | 0   | 1   | 0   | = 10   |
| 1   | 0   | 1   | 1   | = 11   |
| 1   | 1   | 0   | 0   | = 12   |
| 1   | 1   | 0   | 1   | = 13   |
| 1   | 1   | 1   | 0   | = 14   |
| 1   | 1   | 1   | 1   | = 15   |

## code:

```
fun main(){
    //Bitwise
    var bit1 = 12 ;
    var bit2 = 5 ;
    println("bitwise AND="+(bit1.and(bit2)));
    println("bitwise OR="+(bit1.or(bit2)));
    println("bitwise XOR="+(bit1.xor(bit2)));
    println("bitwise NOT="+(bit1.inv())); // -11 unpredictable
    println("bitwise Leftshift="+(bit1.shl(1))); //num * 2
    println("bitwise Rightshift="+(bit1.shr(1))); // num / 2
    println("bitwise tripleRightshift="+(bit1.ushr(1))); // num / 2
}
```

## In Operator

Used to check if a value exists in a collection or range.

## code:

```
fun main(){
    //InOperator
    var key = 45;
    if(key in 1..100){ //range 1..100
        println("The Key = "+key+" is in range 1..100");
    }

}
```

## Elvis Operator (?:)

Returns the value if not null, or the default if null.

## code:

```
fun main(){
    //Elvis Operator
    var name : String ?= null  //Declare 'name' as nullable
    var uname = name ?: "Guest";  //If name is null, use "Guest"
    println("name="+uname);
}
```

## Safe Call (?.) and Not-Null Assertion (!!)

```
fun main(){
    //usage
    var name : String ?= null  //Declare 'name' as nullable
    var uname = name ?: "Guest";  //If name is null, use "Guest"
    println("name="+uname);
    //var name : String? = null
    println(name?.length)   // Safe call — prints null
    println(name!!.length)  // Throws exception if null
}

```

## Expression Usage

Kotlin allows if, when, and even try to return values.

```
val max = if (a > b) a else b
val result = when (score) {
    in 90..100 -> "A"
    in 70..89 -> "B"
    else -> "F"
}
```
