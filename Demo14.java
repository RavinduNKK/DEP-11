public class Demo14 {
    public static void main(String[] args) {
        
        final int My_CONST =10;
        final int MY_CONST2 = 10 * (int) Math.random();


        byte myByte = 10;           // Value bit (7) <= (int)Value Bit (31);
        //byte myBite = 128;        // out of tha range
        byte myBite2 = MY_CONST2; // compile time constant
        // byte myByte3 = My_CONST2; // Runtime Constant

        short myShort2 = 355;       // Value bit (15) <= (int)Value Bit (31);

        char myChar2 = 65;          // Value bit (16) <= Value Bit (31);
        //char myChar2 = -65;          // out of tha range

        // myChar = myShort;        // value Bits (16) <= valuse Bits (15)
        // myChar = myByte;         // value Bits (16) <= valuse Bits (7)

        long myLong = myByte;
        float myFloat6 = myLong;    // Value bits (31) <= (Double)Value Bit (63)
    }
    
}
