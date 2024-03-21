package by.itstep.goutor.javalesson.lesson34.model.data;

public class WeekDay {
    private final String name;
    private final int number;

    public WeekDay() {
        name = "Monday";
        number = 1;
    }

    public WeekDay(String name, int number) {
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
