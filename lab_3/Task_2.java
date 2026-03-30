package lab_3;

public class Task_2 {
    public static void main(String[] args) {
        // 1. Создайте объекты класса Double, используя методы valueOf().
        Double doubleObject1 = Double.valueOf(10.5346);
        Double doubleObject2 = Double.valueOf("23.325");

        // 2. Преобразовать значение типа String к типу double.
        String strValue = "12.35";
        double parsedValue = Double.parseDouble(strValue);

        // 3. Преобразовать объект класса Double ко всем примитивным типам.
        double primitiveDouble = doubleObject1.doubleValue();
        float primitiveFloat = doubleObject1.floatValue();
        long primitiveLong = doubleObject1.longValue();
        int primitiveInt = doubleObject1.intValue();

        // 4. Вывести значение объекта Double на консоль.
        System.out.println("Значение объекта Double 1: " + doubleObject1);
        System.out.println("Значение объекта Double 2: " + doubleObject2);
        System.out.println("Проанализированное значение из String: " + parsedValue);
        System.out.println("Преобразованный в double: " + primitiveDouble);
        System.out.println("Преобразованный в float: " + primitiveFloat);
        System.out.println("Преобразованный в long: " + primitiveLong);
        System.out.println("Преобразованный в int: " + primitiveInt);

        // 5. Преобразовать литерал типа double к строке
        String d = Double.toString(3.14);
        System.out.println("Значение литерала типа double в строковом представлении: " + d);
    }
}
