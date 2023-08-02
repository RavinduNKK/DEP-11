public class Demo16 {
    public static void main(String[] args) {
        
        byte myByte = 10; //implicit Narrow Primitive Conversion
        
        final int myInt = 10; 
        byte myByte2 = myInt; //implicit Narrow Primitive Conversion

        int myInt2 = 10; // myint2 is a variable
        // byte myByte3 = myInt2; compiler didn't get the risk as myInt2 valueis can vary
        byte myByte3 = (byte)myInt2; //Explicit Narrowing primitive Conversion
        System.out.println(myByte3);

        byte myByte4 = (byte) 758; //Explicit NPC
        System.out.println(myByte4);

        byte myByte5 = (byte) (5 > 2);
        byte myByte6 = (byte) (10+250);
        byte mybyte7 = (byte) "abc";

        Object a = "abc";
        Byte myByte9 = (byte) a;

        Object b = 10;
        Byte myByte10 = (byte) b;

        //Calender c = calandar.getInstance();
        //byte myByte11 = (byte) c;

        long myLong = 10;
        int myInt3 = (int) myLong;
        
    }
}
