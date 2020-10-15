public class ChoiceTariff {
    public static void main(String[] args) {
        String id;
        String name = "Везде онлайн";
        int callLimit = 500;
        String addition = "+ безлимит на Tele2 России";
        int internetLimit = 40;
        String additionIL = "+безлимитные";
        String pictureUrl;
        Short cost = 500;
        String text = "Рублей/месяц";
        String button = "Купить SIM";
        Terms tariff = new Terms();
        System.out.println(tariff.id);
        System.out.println(tariff.name);
        System.out.println(tariff.callLimit);
        System.out.println(tariff.addition);
        System.out.println(tariff.internetLimit);
        System.out.println(tariff.additionIL);
        System.out.println(tariff.pictureUrl);
        System.out.println(tariff.cost);
        System.out.println(tariff.text);
        System.out.println(tariff.button);
        tariff.id = null;
        tariff.name = "Везде онлайн";
        tariff.callLimit = 500;
        tariff.addition = "+ безлимит на Tele2 России";
        tariff.internetLimit = 40;
        tariff.additionIL = "+безлимитные";
        tariff.pictureUrl = null;
        tariff.cost = 500;
        tariff.text = "Рублей/месяц";
        tariff.button = "Купить SIM";
    }
}
