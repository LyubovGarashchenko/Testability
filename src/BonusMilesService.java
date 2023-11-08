public class BonusMilesService {
    public int calculate(int amount, int bonus) {
        int price = amount / bonus;
        return price;
    }
}
