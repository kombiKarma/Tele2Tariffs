public class ChoiceTariff {
    public static void main(String[] args) {

        Terms tariff = new Terms();

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

        System.out.println((String) null);
        System.out.println(tariff.name);
        System.out.println(tariff.callLimit);
        System.out.println(tariff.addition);
        System.out.println(tariff.internetLimit);
        System.out.println(tariff.additionIL);
        System.out.println((String) null);
        System.out.println(tariff.cost);
        System.out.println(tariff.text);
        System.out.println(tariff.button);
    }
}
