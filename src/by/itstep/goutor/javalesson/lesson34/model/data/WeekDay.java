package by.itstep.goutor.javalesson.lesson34.model.data;

public class WeekDay {
    public static final WeekDay MONDAY = new WeekDay("Monday", 1);
    public static final WeekDay TUESDAY = new WeekDay("Tuesday", 2);
    public static final WeekDay WEDNESDAY = new WeekDay("Wednesday", 3);
    public static final WeekDay THURSDAY = new WeekDay("Thursday", 4);
    public static final WeekDay FRIDAY = new WeekDay("Friday", 5);
    public static final WeekDay SATURDAY = new WeekDay("Saturday", 6);
    public static final WeekDay SUNDAY = new WeekDay("Sunday", 7);


    private final String name;
    private final int number;

    private WeekDay() {
        name = "Monday";
        number = 1;
    }

    private WeekDay(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return name + "[" + number + "]";
    }
}
