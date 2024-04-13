public class Main {
    public static void main(String[] args) {
        int start = 200; // начальный счёт
        int load = 300; // сумма пополнения
        int bonus = load / 100;
        int total = start + load + bonus;

        if (load < 1000) {
            System.out.println("Баланс:" + (start + load));
            System.out.println("Бонусные рубли:" + 0);
        } else {
            System.out.println("Баланс:" + total);
            System.out.println("Бонусные рубли:" + bonus);
        }
    }
}