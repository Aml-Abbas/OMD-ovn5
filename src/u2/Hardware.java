package u2;

import java.util.ArrayList;
import java.util.Optional;

public class Hardware {

    SoundCard soundCard;

    public Hardware() {
        soundCard= new NoCard();
    }

    public SoundCard getSoundCard() {
        return soundCard;
    }
    public void initialize(){
        this.soundCard= new Card("2020");
    }

    /*
       public void playSound(String name){

           1-Optional <SoundCard> card= Optional.of(new soundCard()); ->non null object
           a- isPresent();: return true
           b- get();: return value
           2-optional.empty() -> null object
            a- isPresent();: return false
           b- get();: throw nosuchelementtexeption
           3- optional.ofNullable(t value)  -> kolla value
           alltså(  Optional <SoundCard> card= Optional.of(hardware.getSoundCard()); )
           om null return optional.empty()
           else return optional.of()

           //1 sätt
           card.ifPresent(c -> c.playSound(name));
           //2 sätt
           if (card.ifPresent()){
               card.get().playSound(name);
           }
       } */

    public static void main(String[] args) {
        // if we don't have a sound card installed
        Hardware hardware = new Hardware();
        System.out.println(hardware.getSoundCard().getVersion());
        hardware.soundCard.playFile("music");

        // if we have a sound card installed
        Hardware hardware1 = new Hardware();
        hardware1.initialize();
        System.out.println(hardware1.getSoundCard().getVersion());
        hardware1.soundCard.playFile("music");

    }
}
