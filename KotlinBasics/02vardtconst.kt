
// top level Global constant
const val pi = 3.142;

fun main(){
    var num = 5; //Mutable Int
    println("num="+num);
    num += 10;
    println("updated num="+num);
    
    val num2 = 748; //Immutable Int (like final in Java)
    println("val num2="+num2);
    
    //num2 += 10; //error:02vardtconst.kt:8:5: error: 'val' cannot be reassigned.
    //println("updated val num2="+num2);
    
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

    //constants
    val maxUser = 10;
    println("constant maxUser="+maxUser);

    println("const global PI="+pi);
}

