/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.notes;
import error.NoResultException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author ASUS
 */
@Local
public interface NotesControllerLocal {
    public notes createNote(notes newNote);
    
    public notes updateNote(notes currEvent) throws NoResultException;
    
    public void deleteNote(Long notesId) throws NoResultException;
    
    public List getNote(Long id)throws NoResultException;
}
