
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        BonusMilesService serviceSecond = new BonusMilesService();
        price = 8_000;
        miles = service.calculate(price);
        System.out.println(miles);
    }
}