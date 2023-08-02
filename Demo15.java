public class Demo15 {
    public static void main(String[] args) {
        byte myBite =10;
        int myInt = myBite;
        int myInt2 = Integer.valueOf(Integer.toBinaryString(myInt));
        System.out.printf("%032d \n", myInt2);

        byte myByte2 = -2;
        System.out.println(Integer.toBinaryString(myByte2));
     
        final byte myBite3 = 10; // COMPILE-TIME CONSTANT
       final int MY_INT4 = myBite; // RUN-TIME CONSTANT
        byte myByte4 = MY_INT3;


        byte myBite5 = 10;  // VARIABLE
        final int MY_INT4 = myBite; // RUN-TIME CONSTANT
        //byte myByte6 = MY_INT4;

        final int MY_INT5 = 15;  // COMPILE-TIME CONSTANT
        final int MY_INT6 = 15 * (int) Math.random(); //RUN-TIME CONSTANT
    }
}
