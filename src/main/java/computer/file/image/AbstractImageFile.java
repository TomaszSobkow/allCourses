package computer.file.image;

import computer.file.AbstractFile;
import computer.file.FileType;

public abstract class AbstractImageFile extends AbstractFile {

    protected AbstractImageFile(String fileName, int fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public FileType getFileType() {
        return FileType.IMAGE;
    }
}
