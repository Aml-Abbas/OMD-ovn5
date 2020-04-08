package SongPlay;

public class Song extends SongComponent{
    String name, band, year;

    public Song(String name, String band, String year){
        this.name= name;
        this.band=band;
        this.year=year;
    }
    public String getName(){
        return name;
    }
    public String getBand(){
        return band;
    }
    public String getYear(){
        return year;
    }
    public void displaySongInfo(){
        System.out.println( getName()+" was recorded by "+ getBand()+" in "+getYear());
    }
}
