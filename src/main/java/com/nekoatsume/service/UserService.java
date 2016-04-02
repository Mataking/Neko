package com.nekoatsume.service;

import java.util.List;

import com.nekoatsume.model.User;
import com.nekoatsume.model.UserRole;
//joue le rôle du webservice pour les fonctions dédié pour les utilisateurs

/**
 *
 * @author Mata
 */
public interface UserService {

    /**
     *
     * @param login
     * @return
     */
    public User getUser(String login);

    /**
     *
     * @param id
     * @return
     */
    public User getUserById(int id);

    /**
     *
     * @param id
     * @return
     */
    public UserRole getByUserId(int id);

    /**
     *
     * @param user
     */
    public void addUser(User user);

    /**
     *
     * @param user
     */
    public void editUser(User user);

    /**
     *
     * @param user
     */
    void updateUser(User user);

    /**
     *
     * @return
     */
    public List<User> listeUser();

    /**
     *
     * @param user
     */
    public void bannirUser(User user);

    /**
     *
     * @param user
     */
    public void revaliderUser(User user);

    /**
     *
     * @param mail
     * @return
     */
    public User findByEmail(String mail);
}
