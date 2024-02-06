public class Main {
    public static void main(String[] args) {
        int init_account = 1500; // начальный счет
        int addition = 100; // пополнение счета
        int bonus = 100; // 1 бонус за каждые 100 рублей


        if (addition >= bonus) {
            int amount_bonus = addition/bonus;
            System.out.println((("На ваш счет зачислено ") + (init_account + addition + amount_bonus) + (" рублей/рубля")));
            System.out.println(("Количество бонусов = ") + (amount_bonus));
        } else {
            System.out.println((("На ваш счет зачислено ") + (init_account + addition) + (" рублей/рубля")));
        }


    }
}