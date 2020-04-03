package u2;

public class Hardware {

    SoundCard soundCard;

    public Hardware(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    SoundCard getSoundCard() {
        return soundCard;
    }


    public static void main(String[] args) {
        // if we don't have a sound card installed
        Hardware hardware = new Hardware(new NoCard());
        System.out.println(hardware.getSoundCard().getVersion());

        // if we have a sound card installed
        Hardware hardware1 = new Hardware(new Card("9"));
        System.out.println(hardware1.getSoundCard().getVersion());

    }
}
