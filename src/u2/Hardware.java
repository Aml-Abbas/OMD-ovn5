package u2;

public class Hardware {

    SoundCard soundCard;

    public Hardware(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    SoundCard getSoundCard() {
        return soundCard;
    }
    void  setSoundCard(SoundCard soundCard){
        this.soundCard= soundCard;
    }

    public static void main(String[] args) {
        // if we don't have a sound card installed
        Hardware hardware = new Hardware(new NoCard());
        System.out.println(hardware.getSoundCard().getVersion());
        hardware.soundCard.playFile("music");

        // if we have a sound card installed
        Hardware hardware1 = new Hardware(new Card("9"));
        System.out.println(hardware1.getSoundCard().getVersion());
        hardware1.soundCard.playFile("music");
    }

    // private Optional<Soundcard> soundcard;
    //the same optional references to a soundcard with a value or an empty value
    // in this code we used a class for representing soundcard with value and another class for representing a null value
/*     we can't escape if sats
    if(soundcard.isPresent()){
        System.out.println(soundcard.getVersion());
    } else{ return "-1";}*/
}
