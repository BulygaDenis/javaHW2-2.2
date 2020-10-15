public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        long bmi = service.calculate (76,176);
        System.out.println(bmi);
    }
}
