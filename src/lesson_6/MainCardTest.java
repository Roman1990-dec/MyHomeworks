package lesson_6;

public class MainCardTest {
    public static void main(String[] args){
        CreditCard cardOne=new CreditCard("1234-5678-9101-9678",100.0);
        CreditCard cardTwo=new CreditCard("4567-6789-5678-4562",250.5);
        CreditCard cardThree=new CreditCard("9909-0934-3212-0056",450.0);
        //Вывести начальное состония
        System.out.println("Баланс карт: ");
        cardOne.displayCardInfo();
        cardTwo.displayCardInfo();
        cardThree.displayCardInfo();
        //Тестовый сценарий для проверки: Положите деньги на первые две карточки и снимите с
        //третьей
        System.out.println("\n >>> Транзакции <<<");
        cardOne.deposit(75);
        cardTwo.deposit(38.9);
        cardThree.withdraw(175.5);
        //cardThree.withdraw(500); //для проверки обработки неправильной операции
        //cardOne.deposit(-56); //для проверки обработки неправильной операции
        // Выведите на экран текущее состояние всех трех карточек
        System.out.println("\n >>> Текущий баланс карт <<<");
        cardOne.displayCardInfo();
        cardTwo.displayCardInfo();
        cardThree.displayCardInfo();
    }
}
