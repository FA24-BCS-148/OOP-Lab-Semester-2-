public class Supervisor extends Person{
    private int YearsOfExperience;

    public Supervisor(String name, int yearsOfExperience) {
        super(name);
        YearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return YearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        YearsOfExperience = yearsOfExperience;
    }
}
