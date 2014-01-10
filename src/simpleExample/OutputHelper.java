package simpleExample;

public class OutputHelper {

    IOutputGenerator ioutputGenerator;

    public void setIoutputGenerator(IOutputGenerator ioutputGenerator) {
        this.ioutputGenerator = ioutputGenerator;
    }

    public void output() {
        ioutputGenerator.generateOutPut();
    }
}
