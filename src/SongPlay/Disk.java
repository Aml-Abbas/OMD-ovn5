package SongPlay;

public class Disk {
    SongComponent songComponent;

    public Disk(SongComponent songComponent){
        this.songComponent=songComponent;
    }
    public  void  displaySongList(){
        songComponent.displaySongInfo();
    }
}
