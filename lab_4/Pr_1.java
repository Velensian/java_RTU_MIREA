package lab_4;


// 1
public class Pr_1 {

    public enum Season {
        WINTER(-5),
        SPRING(10),
        SUMMER(27),
        AUTUMN(15);

        private final int averageTemperature;

        Season(int averageTemperature) {
            this.averageTemperature = averageTemperature;
        }

        public int getAverageTemperature() {
            return averageTemperature;
        }

        public String getDescription() {
            switch (this) {
                case SUMMER -> {return "Жаркая погода, солнечные дни, " +
                        "пик растительности. Время отдыха на природе и сбора урожая.";}
                case AUTUMN -> {return "Похолодание, изменение цвета листвы, сбор урожая. " +
                        "Дни становятся короче.";}
                case WINTER -> {return "Холодная погода, снег и морозы. " +
                        "Время праздников и зимних видов спорта.";}
                case SPRING -> {return "Пробуждение природы, таяние снега, цветение растений. " +
                        "Температура постепенно повышается. Это время обновления и роста.";}
                default -> {return "Unknown season";}
            }
        }
    }

    public static void main(String[] args) {
        Season favoriteSeason = Season.WINTER;
        System.out.println("Любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature());
        System.out.println("Описание: " + favoriteSeason.getDescription());

        System.out.println();
        printSeasonMessage(favoriteSeason);
        System.out.println();

        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средч   няя температура: " + season.getAverageTemperature());
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }

    public static void printSeasonMessage(Season season) {
        switch (season) {
            case WINTER -> System.out.println("Я люблю зиму");
            case SPRING -> System.out.println("Я люблю весну");
            case SUMMER -> System.out.println("Я люблю лето");
            case AUTUMN -> System.out.println("Я люблю осень");
        }
    }
}

