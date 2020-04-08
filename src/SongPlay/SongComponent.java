package SongPlay;

public abstract class SongComponent {

    public String getBandName() {
        throw new UnsupportedOperationException();
    }
    public String getReleaseYear() {
        throw new UnsupportedOperationException();
    }
    public void add(SongComponent music1) {
        throw new UnsupportedOperationException();
    }
    public void remove(SongComponent music1) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }

    public SongComponent getComponent(int index) {
        throw new UnsupportedOperationException();
    }

    public void displaySongInfo(){
        throw new UnsupportedOperationException();
    }
}
