import java.net.Socket;

public class Demo17 {
public static void main(String[] args) {
    byte myByte = -10;
    char myChar = (char) myByte;
    System.out.println(Integer.toBinaryString(myByte));
    // int myInt = myChar;
    // short myShort= (short) myChar;
    // byte myByte2= (byte) myChar;
    // System.out.println(myInt);
    // System.out.println(myShort);
    // System.out.println(myByte2);
    // System.out.println(Integer.toBinaryString(myInt));


    char myChar2 = (char) (myByte & 0xFF);
    System.out.println(Integer.toBinaryString(myByte & 0xFF));
    //Int myInt2 = myChar2;
    // short myShort2 = (short) myChar2;
    // byte myByte3= ()
    // byte myByte2 = (byte) myChar;
    // char myChar2 = (char) (myByte & 0xFFFF);
    // byte myByte3 = (byte) myChar2;
    // System.out.println(myInt);
    // System.out.println(myByte2);
    // System.out.println(myByte3);

}    
}
