package computer.file.image;

public class JPGImageImageFile extends AbstractImageFile {

    private final int compression;

    public JPGImageImageFile(String fileName, int fileSize, int compression) {
        super(fileName, fileSize);
        this.compression = compression;
    }

    public int getCompression() {

        return compression;
    }

    public void displayImage(){
        System.out.println("Displaying JPG File");
    }
}
