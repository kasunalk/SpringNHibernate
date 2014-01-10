package springel;

public class QuadCopter {

    private ESC electronicSpeedController;
    private String escFunction;
    private String motorDescription;

    public ESC getElectronicSpeedController() {
        return electronicSpeedController;
    }

    public void setElectronicSpeedController(ESC electronicSpeedController) {
        this.electronicSpeedController = electronicSpeedController;
    }

    public String getEscFunction() {
        return escFunction;
    }

    public void setEscFunction(String escFunction) {
        this.escFunction = escFunction;
    }

    public void setMotorDescription(String description) {
        this.motorDescription = description;
    }

    @Override
    public String toString() {
        return "QuadCopter{" +
                "electronicSpeedController=" + electronicSpeedController +
                ", escFunction='" + escFunction + '\'' +
                ", motorDescription='" + motorDescription + '\'' +
                '}';
    }
}
