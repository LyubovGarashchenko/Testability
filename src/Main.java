public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int myPrice = service.calculate(10_000, 20);
        System.out.println(myPrice);
    }
}