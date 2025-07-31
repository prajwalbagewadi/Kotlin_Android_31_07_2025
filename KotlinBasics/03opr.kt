fun main(){
    var a = 10;
    var b = 20;
    //Arithmetic
    println("addition="+(a+b));
    println("substraction="+(b-a));
    println("multiplication="+(b*a));
    println("division="+(b/a));
    println("(remainder) modulus="+(b%a));

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

    //Comparison
    var num1 = 10;
    var num2 = 20;
    println("Equal to="+(num1==num2));
    println("Not Equal="+(num1!=num2));
    println("Greater than="+(num2>num1));
    println("less than="+(num1<num2));
    println("Greater or Equal="+(num1>=num2));
    println("less or Equal="+(num1<=num2));

    //Logical
    var x = 3;
    println("Logical And="+(x>2 && x<5));
    x = 10;
    println("Logical OR="+(x>2 || x<5));
    println("Logical Not="+(!(x<5)));
}