package com.nekoatsume.dao;

import java.util.List;

import com.nekoatsume.model.Chat;
import com.nekoatsume.model.User;
import com.nekoatsume.model.UserRole;

/**
 *
 * @author Mata
 */
public interface UserDAO {

    //recupère un utilisateur en fonction de son pseudo

    /**
     *
     * @param login
     * @return
     */
    public User getUser(String login);

    //recupère un utilisateur en fonction de son id

    /**
     *
     * @param id
     * @return
     */
    public User getUserById(int id);

    //methode d'ajout d'un nouvel utilisateur lors de phase d'inscription

    /**
     *
     * @param user
     */
    public void add(User user);

    //update un utilisateur si ce dernier décide changer de mot de passe ou d'adresse mail

    /**
     *
     * @param user
     */
    public void edit(User user);

    //recupère tous les utilisateurs inscrits

    /**
     *
     * @return
     */
    public List<User> listeUser();

    //permet a l'admin de bannir un utilisateur

    /**
     *
     * @param user
     */
    public void bannirUser(User user);

    //permet a l'admin de debannir un utilisateur

    /**
     *
     * @param user
     */
    public void revaliderUser(User user);

    //recupère un utilisateur grace a son email

    /**
     *
     * @param mail
     * @return
     */
    public User findByEmail(String mail);

    /**
     *
     * @param id
     * @return
     */
    public UserRole getByUserId(int id);
}
