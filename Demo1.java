public class Demo1 {

public static void main(String[] args) {
    
    final int id = 1;
    String name = "Kasun";
    double avgMarks = 65.29999;

    System.out.printf("id=%d, name=%s, avgMarks=%.2f \n", id, name, avgMarks);
    System.out.printf("id=S%04d, name=%s, avgMarks=%.2f \n", id, name, avgMarks);
    
}
}