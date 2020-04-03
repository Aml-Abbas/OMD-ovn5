package u2;

public class NoCard extends SoundCard {

    public NoCard() {
    }

    @Override
    String getVersion() {
        return "Sound card not available!";
    }

    @Override
    void playFile(String fileName) {
        System.out.println("Sound card not available!");
    }
}
