package computer;

public class Monitor {

    private Integer width = 3840;
    private Integer height = 1920;

    public void HDReady(){
        this.width = 720;
        this.height = 640;
    }

    public void fullHD(){
        this.width = 1920;
        this.height = 1080;
    }

    public void qHD(){
        this.width = 3840;
        this.height = 1920;
    }

    @Override
    public String toString() {
        return "\n\tMonitor: " + "Width= " + width + "px\tHeight= " + height+"px";
    }
}
