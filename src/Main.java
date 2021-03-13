public class Main {
    public static void main(String[] args) {
        double mass = 90.5;
        double height = 1.79;
        BmiService service = new BmiService();
        double index = service.calculate(mass, height);
        System.out.printf("%.2f", index);
    }
}
