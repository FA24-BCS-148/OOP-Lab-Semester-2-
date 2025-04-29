import java.util.Objects;

public class PermitHolder extends Person{
    private int permitId;
    private static int b = 999;

    public PermitHolder(String name) {
        super(name);
        b = b + 1;
        permitId = b;
    }

    public int getPermitId() {
        return permitId;
    }

    public void setPermitId(int permitId) {
        this.permitId = permitId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        PermitHolder that = (PermitHolder) o;
        return Objects.equals(permitId, that.permitId);
    }

}
