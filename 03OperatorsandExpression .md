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
