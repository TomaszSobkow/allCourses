package computer.drive;

import computer.file.File;

public interface Drive {

    void addFile(File file);
    String fileList();
    File findFile(String fileName);

}
