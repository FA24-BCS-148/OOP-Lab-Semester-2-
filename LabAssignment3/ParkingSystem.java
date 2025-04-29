public class ParkingSystem {
    private Supervisor supervisor;
    private ParkingZone[] zones = new ParkingZone[2];
    private String name;

    public ParkingSystem(String name, Supervisor supervisor) {
        this.name = name;
        this.supervisor = supervisor;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addZone(ParkingZone zone){

    }

    public void addPermitHolder(PermitHolder ph){

    }
}
