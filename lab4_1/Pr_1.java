package lab4_1;

// 2
class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("Unknown", "Unknown", 0.0);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    // Перегруженный метод receiveCall
    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + " с номера " + callerNumber);
    }

    public void sendMessage(String... numbers) {
        System.out.println("Сообщения будут отправлены на следующие номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

    public void displayInfo() {
        System.out.println("Номер: " + number + ", Модель: " + model + ", Вес: " + weight);
    }
}

public class Pr_1 {
    public static void main(String[] args) {

        Phone phone1 = new Phone("88005553535", "Apple", 150.0);
        Phone phone2 = new Phone("98765432143", "Samsung", 147.0);
        Phone phone3 = new Phone();

        phone1.displayInfo();
        phone2.displayInfo();
        phone3.displayInfo();

        phone1.receiveCall("Семен");
        phone2.receiveCall("Антонина", "1122334455");

        System.out.println("Номер первого телефона: " + phone1.getNumber());

        phone1.sendMessage("353255235", "67457477", "45742555575");
    }
}
