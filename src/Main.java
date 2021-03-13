public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(90, 1.9);
        System.out.printf("%.2f", index);
    }
}
