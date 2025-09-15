public class Main {
    public static void main(String[] args) {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        System.out.println(Math.random());
        System.out.println(Math.random() *10);
        System.out.println((int) (Math.random() *10));
        System.out.println((int) (Math.random() *10) +1);
        System.out.println(Math.random() < 0.05);
        f.simulateOneDay(12);
        System.out.println(f.getCurrentFood());
        f = new Feeder(1000);
        f.simulateOneDay(22);
        System.out.println(f.getCurrentFood());
        f = new Feeder(2400);
        System.out.println(f.simulateManyDays(10,4));
        f = new Feeder(250);
        System.out.println(f.simulateManyDays(10, 5));
        f = new Feeder(0);
        System.out.println(f.simulateManyDays(10, 5));

    }
}
