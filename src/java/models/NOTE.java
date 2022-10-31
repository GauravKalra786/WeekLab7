/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.Serializable;


public class NOTE implements Serializable {
    private int noteId;
    private String title;
    private String contents;
    private String owner;
    
    
    public NOTE() 
    {
    
}
public NOTE(int noteId,String title , String contents , String owner){
    this.noteId = noteId;
    this.contents= contents;
    this.title = title;
    this.owner= owner;
    

}

public int getNOTEId(){
   return noteId; 
}

public void setNoteId(int noteId){
    this.noteId = noteId;
    
}

public String getTitle(){
    return title;
}

public void setTitle(String Title){
    this.title = Title;
    
}


public String getOwner(){
    return owner;
}

public void setOwner(String Owner){
    this.owner = Owner;
    
}

public String getContents(){
    return contents;
}

public void setContents(String Contents){
    this.contents = Contents;
    
}


}



