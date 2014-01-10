package beanbasic;

public class QuadCopter {

    private String gyrometer;
    private String microController;

    public String getGyrometer() {
        return gyrometer;
    }

    public void setGyrometer(String gyrometer) {
        this.gyrometer = gyrometer;
    }

    public String getMicroController() {
        return microController;
    }

    public void setMicroController(String microController) {
        this.microController = microController;
    }

    public void printSpec() {
        System.out.println(getGyrometer() + " "+ getMicroController());
    }
}
