public class BonusMilesService {
    public int calculate(int amount, int bonus) {
        bonus = 20; // за каждые 20 рублей начисляется 1 миля
        int price = amount / bonus;
        return price;
    }
}
