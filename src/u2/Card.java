package u2;

public class Card extends SoundCard {
    private String version;

    public Card(String version) {
        this.version = version;
    }

    @Override
    String getVersion() {
        return this.version;
    }

    @Override
    void playFile(String fileName) {
        System.out.println("Playing " + fileName + "...");
    }
}
