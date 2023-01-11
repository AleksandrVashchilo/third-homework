public class Main {
    public static void main(String[] args) {

        //Person person = new Person("Mark", 35, 170, 65);
        //Person secondPerson = new Person();

        Money money = new Money();
        int m = money.getMoney();
        System.out.println(m);


        PensionFund statePensionFund = new PensionFund("Government", true, "10-01-1989");
        PensionFund nonStatePensionFund = new PensionFund("London Personal", false, "30-12-1978");

        double statePension = statePensionFund.calculatePension(40, 1000, 2800);
        double nonStatePension = nonStatePensionFund.calculatePension(40, 1000, 2800);

        System.out.println(statePension);
        System.out.println(nonStatePension);

        //String name = person.getName();
        //System.out.println(name);

        //person.setName("Pavel");
        //name = person.getName();
        //System.out.println(name);
    }
}