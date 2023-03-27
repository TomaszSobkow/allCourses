package computer.file;

public abstract class AbstractFile implements File{

    protected String fileName;
    protected int fileSize;

    protected AbstractFile(String fileName, int fileSize) {
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public String getFileName() {
        return fileName;
    }

    @Override
    public int getFileSize() {
        return fileSize;
    }
}
