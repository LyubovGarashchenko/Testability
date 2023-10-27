public class BonusMilesService {
    public int calculate(int price) {
        int miles;
        int amount = 10_000; // стоимость билета
        int bonus = 20; // за каждые 20 рублей начисляется 1 миля
        miles = amount / bonus;
        return miles;
    }
}
