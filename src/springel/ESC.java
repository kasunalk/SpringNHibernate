package springel;

public class ESC {

    private String electronicSpeedController;
    private String voltage;

    public String getElectronicSpeedController() {
        return electronicSpeedController;
    }

    public void setElectronicSpeedController(String electronicSpeedController) {
        this.electronicSpeedController = electronicSpeedController;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public String getNoOfMotorsUsing(int noOFMotors) {
        return "For "+noOFMotors + " we need " + noOFMotors + " ESC's.";
    }
}
