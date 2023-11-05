public class BonusMilesService {
    public int calculate(int price) {
        int amount = 10_000; // стоимость билета
        int bonus = 20; // за каждые 20 рублей начисляется 1 миля
        price = amount / bonus;
        return price;
    }
}
