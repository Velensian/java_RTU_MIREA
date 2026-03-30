package lab_13;

class PhoneNumberFormatter {
    private String phoneNumber;

    public PhoneNumberFormatter(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String format() {
        String normalizedNumber;

        normalizedNumber = phoneNumber.replaceAll("[^\\d]", "");

        if (normalizedNumber.startsWith("8")) {
            normalizedNumber = "7" + normalizedNumber.substring(1);
        }

        if (normalizedNumber.length() != 11) {
            throw new IllegalArgumentException("Неверный формат телефонного номера.");
        }

        String сode_1 = normalizedNumber.substring(0, 1);
        String сode_2_4 = normalizedNumber.substring(1, 4);
        String сode_5_7 = normalizedNumber.substring(4, 7);
        String сode_8_11 = normalizedNumber.substring(7, 11);

        return "+" + сode_1 + сode_2_4 + "-" + сode_5_7 + "-" + сode_8_11;
    }
}

public class Pr_5 {
    public static void main(String[] args) {
        try {
            PhoneNumberFormatter formatter1 = new PhoneNumberFormatter("+79175655655");
            System.out.println(formatter1.format());

            PhoneNumberFormatter formatter2 = new PhoneNumberFormatter("89175655655");
            System.out.println(formatter2.format());

            PhoneNumberFormatter formatter3 = new PhoneNumberFormatter("+10428965221");
            System.out.println(formatter3.format());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}

