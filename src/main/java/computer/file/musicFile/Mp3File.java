package computer.file.musicFile;

public class Mp3File extends AbstractMusicFile{


    private final int bitRate;
    public Mp3File(String fileName, int fileSize, String bandName, String title, int bitRate) {
        super(fileName, fileSize, bandName, title);
        this.bitRate = bitRate;
    }


    @Override
    public void play() {
        System.out.println("Playing Mp3 Music");
    }

    public int getBitRate() {
        return bitRate;
    }


}
