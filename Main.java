import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House house1 = new House("","","") ;


        Scanner scanner = new Scanner(System.in);
        System.out.println("chi abita in questa casa?");
        String residenti = scanner.nextLine();
        System.out.println("quale è l'indirizzo?");
        String indirizzo = scanner.nextLine();
        System.out.println("che piano è?");
        String piano = scanner.nextLine();

      //indirizzo = house1.address;
      //residenti =  house1.residentsNames;
      //piano = house1.floorsNumber;

      System.out.println("indirizzo: " + indirizzo + "\n" + "nome residenti " + residenti + "\n" + "piano " + piano);


    }

    }
