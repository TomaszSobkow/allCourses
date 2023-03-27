package computer.drive;

import computer.file.File;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HDD_Drive implements Drive {

    private List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public String fileList() {
    StringBuilder allFiles = new StringBuilder();
        for (File file: files) {
            System.out.println(file.getFileName());
        }
    return allFiles.toString() ;
    }

    @Override
    public File findFile(String fileName) {
        Optional<File> findFile = files.stream()
                .filter(file -> file.getFileName().equals(fileName))
                .findFirst();

        return findFile.orElseThrow();
    }

    @Override
    public String toString() {
        return "HDD";

    }
}
