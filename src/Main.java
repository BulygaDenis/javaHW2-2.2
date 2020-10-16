public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate (76,1.76);

        System.out.printf("%.2f",bmi);
    }
}
