public class Demo2 {
 public static void main(String[] args) {
    String myStr = "IJSE";
    int myInt = 10;
    double myDouble = 25.565;

    /*we can inject any data type inside a string a string place holder */

    System.out.printf("| %s |\n", myStr);
    System.out.printf("| %d |\n", myInt);
    System.out.printf("| %f |\n", myDouble);
    System.out.println();


    /*we can specify the width with any data type */
    System.out.printf("| %6s |\n", myStr);
    System.out.printf("| %6d |\n", myInt);
    System.out.printf("| %6.2f |\n", myDouble);
    System.out.println();

    /*we can left aline with any data type */
    System.out.printf("| %-6s |\n", myStr);
    System.out.printf("| %-6d |\n", myInt);
    System.out.printf("| %-6.2f |\n", myDouble);
    System.out.println();

 
    /*we can use + only with numeric data types (floats, decimals, etc) */
    //System.out.printf("| %+-6s |\n", myStr);
    System.out.printf("| %+-6d |\n", myInt);
    System.out.printf("| %+-6.2f |\n", myDouble);
    System.out.println();

    /*we can use 0 only with numeric data types (floats, decimals, etc) */
    System.out.printf("| %+06d |\n", myInt);
    System.out.printf("| %+06.2f |\n", myDouble);
    System.out.println();

    /*we can use , only with numeric data types (floats, decimals, etc) */
    System.out.printf("| %+0,10d |\n", 125364856);
    System.out.printf("| %+0,10.2f |\n", 152468.25482244);
    System.out.println();

    System.out.printf("%s-%s \n", myInt, myStr);
    System.out.printf("%2$s-%1$s \n", myStr, myInt);
    System.out.printf("%s-%1$s \n", myInt);

 }   
 }   

