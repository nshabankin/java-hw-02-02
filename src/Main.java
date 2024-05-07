public class Main {
    public static void main(String[] args) {
        int account = 590; // счёт клиента
        int payment = 1000; // платёж клиента
        if (payment >= 1000) { // если платёж превышает или равен 1000
            int bonus = payment / 100; // 1 бонусный балл за каждые 100 в платеже
            account = account + payment + bonus; // обновлённый счёт: изначальная сумма + платёж >= 1000 + бонус
        } else { // если платёж меньше 1000
            account = account + payment; // обновлённый счёт: изначальная сумма + платёж < 1000
        }
        System.out.println(account);
    }
}
