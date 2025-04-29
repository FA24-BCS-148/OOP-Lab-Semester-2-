public class Vehicle {
    private String noPlate;
    private String type;
    private Owner owner;

    public Vehicle(String noPlate, Owner owner, String type) {
        this.noPlate = noPlate;
        this.owner = owner;
        this.type = type;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getNoPlate() {
        return noPlate;
    }

    public void setNoPlate(String noPlate) {
        this.noPlate = noPlate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
