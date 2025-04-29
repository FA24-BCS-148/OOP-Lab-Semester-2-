
public class ParkingZone {
    private String zoneId;
    private Vehicle[] vehicles = new Vehicle[5];
    private static int a = 0;
    private static int alphabets = 65;

    public ParkingZone(String zoneId, Vehicle[] vehicles) {
        this.zoneId = zoneId;
        this.vehicles = vehicles;
    }

    public ParkingZone(){
        a = a + 1;
        if (a == 5){
            a = 1;
            alphabets = alphabets + 1;
        }
        zoneId = (char)alphabets + Integer.toString(a);
    }

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle){

    }
}