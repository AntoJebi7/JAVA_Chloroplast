package Section_3_OOPs.HashMaps;

public enum ENUM_class {
    // enum constants
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    private final int value;

    ENUM_class(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}
