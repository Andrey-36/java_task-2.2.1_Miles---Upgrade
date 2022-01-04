public class BonusMilesService {
    public int calculate(int cost) {
        int bonusMileCost = 20;
        int bonusMiles = cost / bonusMileCost;
        return bonusMiles;
    }
}
