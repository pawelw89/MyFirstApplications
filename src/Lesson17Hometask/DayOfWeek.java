package Lesson17Hometask;

public enum DayOfWeek {
    MON("Monday", "Poniedziałek", true),
    TUE("Tuesday", "Wtorek", true),
    WED("Wednesday", "Sroda", true),
    THU("Thursday", "Czwartek", true),
    FRI("Friday", "Piątek", true),
    SAT("Saturday", "Sobota", false),
    SUN("Sunday", "Niedziela", false);

    private String englishName;
    private String polishName;
    boolean workingDay;

    DayOfWeek(String englishName, String polishName, boolean workingDay) {
        this.englishName = englishName;
        this.polishName = polishName;
        this.workingDay = workingDay;
    }

    public String getEnglishName() {
        return englishName;
    }

    public String getPolishName() {
        return polishName;
    }

    public boolean WorkingDay() {
        return workingDay;
    }

    public static DayOfWeek fromEnglishName(String englishName) {
        for (DayOfWeek dayOfWeek : values()) {
            if (dayOfWeek.englishName.equals(englishName)) {
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no day of week with english name: " + englishName);
    }

    public static DayOfWeek fromPolishName(String polishName) {
        for (DayOfWeek dayOfWeek : values()) {
            if (dayOfWeek.polishName.equals(polishName)) {
                return dayOfWeek;
            }
        }
        throw new IllegalArgumentException("There are no day of week with polish name: " + polishName);
    }

    public boolean isWorkingDay(String DayOfWeek) {
        for (DayOfWeek dayOfWeek : values()) {
            if (dayOfWeek.workingDay) {
                return workingDay;
            }
        }
        throw new IllegalArgumentException("There's no such day " + DayOfWeek);
    }
}