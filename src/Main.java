public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int myPrice = service.calculate(10_000);
        int price = 10_000;
        price = service.calculate(price); // должно получиться 500
        System.out.println(price);
    }
}