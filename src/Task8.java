public class Task8 {
    public static void main(String[] args) {
        int totalDeposit = 0;
        for(int i=1; i<13; i++) {
            totalDeposit += 29000;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ totalDeposit +" рублей");
        }
    }
}
