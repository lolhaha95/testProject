/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import entity.User;
import error.NoResultException;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author jiaying
 */
@Local
public interface UserControllerLocal  {
    
    public void createUser(User u);
    public User editUser(User existing) throws NoResultException;
    public List<User> retrieveAllFriends(User u) throws NoResultException;

    public void addFriend(User u, User friend) throws NoResultException;

    public void removeFriend(User u, User friend) throws NoResultException;
    
    
}
