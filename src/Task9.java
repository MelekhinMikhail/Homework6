public class Task9 {
    public static void main(String[] args) {
        float totalDeposit = 0;
        for(int i=1; i<13; i++) {
            totalDeposit += 29000;
            totalDeposit *= 1.01;
            System.out.println("Месяц "+ i +", сумма накоплений равна "+ totalDeposit +" рублей");
        }
    }
}
