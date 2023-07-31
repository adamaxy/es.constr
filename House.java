import java.util.Arrays;

public class House {
private int floorsNumber;
private String address;
  private String[] residentsNames;


    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }
 public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }
    public void houseDetails(){
        System.out.println(String.format("The number of the floor %d", getFloorsNumber()));
        System.out.println(String.format("the address is %s", getAddress()));
        System.out.println(Arrays.toString(getResidentsNames()));
    }
}
