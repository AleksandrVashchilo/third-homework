public class Main {
    public static void main(String[] args) {

        Money money = new Money();
        int m = money.getMoney();
        System.out.println(m);


        PensionFund statePensionFund = new PensionFund("Government", true, "10-01-1989");
        PensionFund nonStatePensionFund = new PensionFund("London Personal", false, "30-12-1978");

        double statePension = statePensionFund.calculatePension(40, 1000, 2800);
        double nonStatePension = nonStatePensionFund.calculatePension(40, 1000, 2800);

        System.out.println(statePension);
        System.out.println(nonStatePension);

        Pensioner pensioner = new Pensioner("Mark", 35, 170, 65, 1.2);
        System.out.println(pensioner);
    }
}