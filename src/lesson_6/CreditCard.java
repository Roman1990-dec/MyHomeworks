package lesson_6;

public class CreditCard {
    public String accountNumber;
    public double currentAmount;
    //Конструктор
    public CreditCard (String accNumber, double initialAmount){
        accountNumber=accNumber;
        currentAmount=initialAmount;
    }
    //Начисление
    public void deposit (double addAmount){
        if (addAmount>0){
            currentAmount+=addAmount;
            System.out.println("На карту "+accountNumber+" успешно начислено: "+addAmount);
        } else {
            System.out.println("Ошибка! Сумма для начисления должа быть положительной!");
        }
    }
    //Снятие
    public void withdraw(double removeAmount){
        if (removeAmount > 0 && removeAmount <= currentAmount){
            currentAmount-=removeAmount;
            System.out.println("С карты "+accountNumber+" успешно снято: "+removeAmount);
        } else {
            System.out.println("Ошибка! Недостаточно средств или неверная сумма для снятия на карте "
                    +accountNumber);
        }
    }
    //Вывод информации
    public void displayCardInfo(){
        System.out.println("---Информация о карте---");
        System.out.println("Номер счета: "+accountNumber);
        System.out.println("Текущая сумма: "+currentAmount);
        System.out.println("-".repeat(30));
    }
}
