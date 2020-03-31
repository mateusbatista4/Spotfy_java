package app;

import java.util.List;

public class User {
    String cpf;
    String birthday;
    String gender;
    boolean isSubscriber;
    List<Playlist> playlistCollection;

    public void addToPlaylistCollection(Playlist playlist){
        if(isSubscriber) 
            if(playlistCollection.size() < 10) playlistCollection.add(playlist);
        else
            if(playlistCollection.size() < 3) playlistCollection.add(playlist);
    }

    public void removeToPlaylistCollection(Playlist playlist) {
        if(playlistCollection.contains(playlist)) playlistCollection.remove(playlist);
    }

    public void changeAccess() {
        if(isSubscriber) isSubscriber = false;
        else isSubscriber = true;
    }

    
}