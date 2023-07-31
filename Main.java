public class Main {
    public static void main(String[] args) {
        String[] residentes = {"antonio", "giovanni", "nicola"};
        House casa = new House();
        casa.setFloorsNumber(5);
        casa.setAddress("Via crispi 78");
        
        casa.setResidentsNames(residentes);
        casa.houseDetails();
    }
}
