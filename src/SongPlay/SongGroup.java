package SongPlay;

import java.util.ArrayList;

public class SongGroup extends SongComponent{
    ArrayList<SongComponent> list= new ArrayList<>();
    String groupName, groupDescription;

    public SongGroup( String groupName, String groupDescription){
        this.groupName= groupName;
        this.groupDescription= groupDescription;
    }
    public String getGroupName(){
        return groupName;
    }
    public String getGroupDescription(){
        return groupDescription;
    }

    public void add(SongComponent newSongComponent){
        list.add(newSongComponent);
    }
    public void remove(SongComponent newSongComponent){
        list.remove(newSongComponent);
    }
    public SongComponent getSongComponent(int index){
        return list.get(index);
    }
    public void displaySongInfo(){
        System.out.println(getGroupName()+" "+getGroupDescription());

        for (int i=0; i<list.size();i++){
            SongComponent newSongComponent= list.get(i);
            newSongComponent.displaySongInfo();
        }
    }
}
