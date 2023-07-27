public class Demo12 {
    public static void main(String[] args) {
        int id1 = 1;
        String name1 = "Kasun";
        String adress1 = "Galle";

        int id2 = 2;
        String name2 = "Nuwan";
        String adress2 = "Matara";

        System.out.printf("id=%s, name=%s, adress=%s \n", id1,name1, adress1);
        System.out.printf("id=%s, name=%s, adress=%s \n", id2,name2, adress2);


        System.out.println("+------------+------------+------------+");
        System.out.println("|\u001B[1m\u001B[32m\u001B[1m     ID     |    Name    |  Address   |");
        System.out.println("+------------+------------+------------+");
        System.out.println("|      1     |    kasun   |   Galle    |");
        System.out.println("|      2     |    Nuwan   |   Matara   |");
        System.out.println("+------------+------------+------------+");



    }
    
}
