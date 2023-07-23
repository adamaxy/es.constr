public class Main {
    public static void main(String[] args) {

class Programmer {
    String name;
    int age;
    boolean wearsGlasses;

    void drinkCoffee() {
        System.out.println("Espresso è il segreto!");
    }

    class House {

        String address;
        int numberOfFloors;

        // Costruttore
        public House(String address, int numberOfFloors) {
            this.address = address;
            this.numberOfFloors = numberOfFloors;
            System.out.println("Una nuova casa è stata creata all'indirizzo: " + address);
        }
    }

    public class Tester {
        public void main(String[] args) {
            // Dichiarazione di due variabili House
            House house1, house2;


            house1 = new House("Via Roma 123", 2);
            house2 = new House("Piazza Italia 7", 3);
        }
    }}}}