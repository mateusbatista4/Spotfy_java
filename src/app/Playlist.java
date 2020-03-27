package app;

import java.util.List;

/**
 * Playlist
 */
public class Playlist {
    String name;
    String genre;
    List<Song> songs;
    
    public void addMusic(Song song, boolean isSubscriber){
        if (isSubscriber) 
            if (this.songs.size() < 100) 
                this.songs.add(song);
            
        else 
            if (this.songs.size() < 10) 
                this.songs.add(song);
               
    }

    public void removeMusic(Song song){
        if(this.songs.contains(song) ) this.songs.remove(song) ;
    }

    public Song returnSmallestSong(){
        Song smallestSong = new Song(); 
        double smaller = 999.0;
        for (Song song : songs) {
            if(song.duration < smaller) smallestSong = song; 
        }
        return smallestSong;
    }

    public Song returnBiggestSong(){
        Song biggestSong = new Song(); 
        double bigger = 0.0;
        for (Song song : songs) {
            if(song.duration > bigger) biggestSong = song; 
        }
        return biggestSong;
    }

    public double averageSongsTime(){
        double sum = 0;
        for (Song song : songs) sum+= song.duration;
        return sum / songs.size();
    }

    public double totalDuration(){
        return averageSongsTime()*songs.size();
    }

    public String mostPopularArtist() {
        int bigest = 0;
        String artist = "";
        for (int i = 0; i < songs.size(); i++) {
            int cont = 0;
            for (int j = 0; j < songs.size(); j++) {
                if (songs.get(i).artist == songs.get(j).artist ) cont ++;
            }
            if(cont>bigest) artist = songs.get(i).artist;
            cont = 0;
        }
        return artist;
    }
}