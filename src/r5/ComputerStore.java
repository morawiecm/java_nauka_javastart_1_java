package r5;

public class ComputerStore {
    public static void main(String[] args)
    {
        /*
        Computer comp1 = new Computer();
        comp1.memory = 8192;
        comp1.processor = "Intel i5";

        Computer comp2 = new Computer();
        comp2.processor = "Amd ryzen 1700";
        comp2.memory = 16834;
        ComputerFactory factory = new ComputerFactory();
        Computer comp1 = factory.create("Intel i5",8192);
        Computer comp2 = factory.create("AMD Ryzen 1700",16384);
        */

        Computer comp1 = new Computer("Intel i5",8192);
        Computer comp2 = new Computer("AMD Ryzen 1700",16384);

        comp1.printInfo();
        comp2.printInfo();

        ComputerUpgrade upgrade = new ComputerUpgrade();
        upgrade.addMemory(comp1,4096);
        comp1.printInfo();



    }
}
