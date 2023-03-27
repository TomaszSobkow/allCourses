package computer.drive;

import computer.file.File;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SSD_Drive implements Drive {
    private Map<String, File> files = new HashMap<>();

    @Override
    public void addFile(File file) {
    this.files.put(file.toString(),file);
    }

    @Override
    public String fileList() {
        Collection<File>collectionsOfFiles = files.values();

        for (File file: collectionsOfFiles) {
            System.out.println(file.getFileName());
        }
        return collectionsOfFiles.toString();
    }

    @Override
    public File findFile(String fileName) {
        return files.get(fileName);
    }

    @Override
    public String toString() {
        return "\n\tDrive: SSD";
    }
}
