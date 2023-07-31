public class Main {
    public static void main(String[] args) {
        String[] residentes = {"Devy", "Salvo", "Peppe"};
        House casa = new House();
        casa.setFloorsNumber(9);
        casa.setAddress("Via Uruguay 30/2");
        
        casa.setResidentsNames(residentes);
        casa.houseDetails();
    }
}
