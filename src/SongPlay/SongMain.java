package SongPlay;

public class SongMain {
    public static void main(String[] args) {

        SongComponent music1 = new SongGroup("music1", "is a style of my first music");
        SongComponent music2 = new SongGroup("music2", "is a style of my second music");
        SongComponent music3 = new SongGroup("music3", "is a style of my third music");

        SongComponent everyMusic = new SongGroup("music List", "Every music Available");
        everyMusic.add(music1);
        music1.add(new Song("Ahwak","Alisa","2011"));
        music1.add(new Song("Love U","Alisa","2011"));
        music1.add(new Song("7abibi","Alisa","2011"));

        everyMusic.add(music2);

        music2.add(new Song("Ahwak","Nancy","2021"));
        music2.add(new Song("Love U","Nancy","2021"));
        music2.add(new Song("7abibi","Nancy","2021"));
        music2.add(music3);

        music3.add(new Song("B7ibak ana kter","Wael","2001"));
        Disk disk=new Disk(everyMusic);
        disk.displaySongList();
    }
}
