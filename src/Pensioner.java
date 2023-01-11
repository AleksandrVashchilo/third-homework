public class Pensioner extends Person{
    private double pension;

    public void setPension(double pension) {
        this.pension = pension;
    }

    public double getPension() {
        return pension;
    }

    @Override
    public void die() {
        double x = (getAge() - 50) * pension;
        System.out.println("Этот пенсионер умер, он заработал: " + x);
    }
}
