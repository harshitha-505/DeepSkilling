package builderpattern;

public class BuilderPatternExample {

    public static void main(String[] args) {

        Computer computer1 = new Computer.Builder()
                .setCpu("Intel i5")
                .setRam("8 GB")
                .setStorage("512 GB SSD")
                .build();

        Computer computer2 = new Computer.Builder()
                .setCpu("Intel i7")
                .setRam("16 GB")
                .setStorage("1 TB SSD")
                .build();

        System.out.println("Computer 1");
        computer1.showDetails();

        System.out.println("Computer 2");
        computer2.showDetails();
    }
}
