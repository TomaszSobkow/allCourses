package computer.file.document;

import computer.file.File;
import computer.file.FileType;

public class Document implements File {
    @Override
    public String getFileName() {
        return null;
    }

    @Override
    public int getFileSize() {
        return 0;
    }

    @Override
    public FileType getFileType() {
        return null;
    }
}
