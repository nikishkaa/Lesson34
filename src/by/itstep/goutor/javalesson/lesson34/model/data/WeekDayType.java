package by.itstep.goutor.javalesson.lesson34.model.data;

public enum WeekDayType {
    MONDAY,
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);
    private final String name;
    private final int number;

    private WeekDayType() {
        name = "Monday";
        number = 1;
    }

    WeekDayType(String name, int number) {
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name + "[" + number + "]";
    }
}
