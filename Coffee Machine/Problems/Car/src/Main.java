class Car {

    private static int staticField;
    private int instanceField;

    public Car(int instanceField) {
        this.instanceField = instanceField;
    }

    public static void staticMethod() {
        staticField = 0;

        /* Do something */ }

    public void instanceMethod() {
        staticField = 0;/* Do something */ }
}