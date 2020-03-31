package app;

/**
 * Song
 */
public class Song implements Comparable<Song>{
    protected String name;
    protected String genre;
    protected String artist;
    protected double duration;

    
    @Override public int compareTo(Song song)
        return this.name.compareTo(song.name);
    }
    
    public void setArtist(String artist) {
        this.artist = artist;
    }
    
    public void setDuration(double duration) {
        this.duration = duration;
    }
   
    public void setGenre(String genre) {
        this.genre = genre;
    }
  
    public void setName(String name) {
        this.name = name;
    }
    
}