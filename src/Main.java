public class Main {
    public static void main(String[] args) {
        int initAccount = 1500; // начальный счет
        int addition = 100; // пополнение счета
        int bonus = 100; // 1 бонус за каждые 100 рублей


        if (addition >= bonus) {
            int amountOfBonus = addition / bonus;
            System.out.println((("На ваш счет зачислено ") + (initAccount + addition + amountOfBonus) + (" рублей/рубля")));
            System.out.println(("Количество бонусов = ") + (amountOfBonus));
        } else {
            System.out.println((("На ваш счет зачислено ") + (initAccount + addition) + (" рублей/рубля")));
        }
    }
}