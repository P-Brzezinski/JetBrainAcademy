class Cat {

    // write static and instance variables
    static int counter = 0;

    String name;
    int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        if (this.counter >= 5){
            System.out.println("You have too many cats");
        }
        this.counter += 1;
    }

    public static int getNumberOfCats() {
        // implement the static method
        return Cat.counter;
    }
}