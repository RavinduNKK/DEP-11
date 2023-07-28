public class Demo1ex {
    public static void main(String[] args) {
        
    final int id = 1;
    String name = "Kasun";
    double avgMarks = 65.29999;

    final String LINE = "+%10s+%15s+%10s+ \n";
    final String RECORD = "|SK-%03|%15s|%6.2f| \n";

    System.out.printf(LINE, "","","");
    System.out.printf(RECORD, id, name, avgMarks);
    System.out.printf(LINE, "","","");
    System.out.printf(RECORD, 2, "Nuwan ramindu", 62.2225);
    System.out.printf(LINE, "","","");
    }
}

