package computer.file.image;


public class GIFImageImageFile extends AbstractImageFile {

    public GIFImageImageFile(String fileName, int size) {
        super(fileName, size);
    }

    public void showAnimation(){
        System.out.println("GIF Animation is showing!!!");
    }
}
