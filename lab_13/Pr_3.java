package lab_13;

import java.util.StringTokenizer;

// 3
class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String country, String region, String city, String street, String house, String building, String apartment) {
        this.country = country.trim();
        this.region = region.trim();
        this.city = city.trim();
        this.street = street.trim();
        this.house = house.trim();
        this.building = building.trim();
        this.apartment = apartment.trim();
    }

    @Override
    public String toString() {
        return String.join(", ", country, region, city, street, house, building, apartment);
    }

    public static Address parseAddressUsingSplit(String addressString) {
        String[] parts = addressString.split(",");
        if (parts.length < 6) {
            throw new IllegalArgumentException("Недостаточно данных для адреса");
        }
        return new Address(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts.length > 6 ? parts[6] : "");
    }

    public static Address parseAddressUsingStringTokenizer(String addressString) {
        StringTokenizer tokenizer = new StringTokenizer(addressString, ",.;");
        if (tokenizer.countTokens() < 6) {
            throw new IllegalArgumentException("Недостаточно данных для адреса");
        }

        String country = tokenizer.nextToken().trim();
        String region = tokenizer.nextToken().trim();
        String city = tokenizer.nextToken().trim();
        String street = tokenizer.nextToken().trim();
        String house = tokenizer.nextToken().trim();
        String building = tokenizer.nextToken().trim();
        String apartment = tokenizer.hasMoreTokens() ? tokenizer.nextToken().trim() : "";

        return new Address(country, region, city, street, house, building, apartment);
    }
}

public class Pr_3 {
    public static void main(String[] args) {
        String address1 = "Россия, Москва, Тверская ул., 10, 1, 5";
        String address2 = "США, Калифорния, Лос-Анджелес, Сансет бульвар, 123, A, 45";
        String address3 = "Франция;     Иль-де-Франс; Париж; Шанз-Элизе; 20; 2; 3";
        String address4 = "Германия. Бавария; Мюнхен. Мариенплац. 5. 3; ";

        System.out.println("Тестирование с использованием split:");
        System.out.println(Address.parseAddressUsingSplit(address1));
        System.out.println(Address.parseAddressUsingSplit(address2));

        System.out.println("\nТестирование с использованием StringTokenizer:");
        System.out.println(Address.parseAddressUsingStringTokenizer(address3));
        System.out.println(Address.parseAddressUsingStringTokenizer(address4));
    }
}

