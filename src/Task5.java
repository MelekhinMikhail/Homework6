public class Task5 {
    public static void main(String[] args) {
        for(int i=1904; i<2097; i++) {
            if((i%4 == 0 && i%100 != 0) || i%400 == 0) {
                System.out.println(i);
            }
        }
    }
}
