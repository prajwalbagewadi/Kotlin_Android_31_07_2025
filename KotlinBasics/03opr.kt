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

    //InOperator
    var key = 45;
    if(key in 1..100){ //range 1..100
        println("The Key = "+key+" is in range 1..100");
    } 

    //Elvis Operator 
    var name : String ?= null  //Declare 'name' as nullable
    var uname = name ?: "Guest";  //If name is null, use "Guest"
    println("name="+uname);

    //Safe Call (?.) and Not-Null Assertion (!!)
    //var name : String? = null
    println(name?.length)   // Safe call — prints null  
    //println(name!!.length)  // Throws exception if null

    val i = 10;
    val j = 20;
    val max = if( i < j) i else j;
    println("max=$max"); 
}