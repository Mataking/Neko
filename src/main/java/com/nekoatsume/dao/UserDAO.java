package com.nekoatsume.dao;

import java.util.List;

import com.nekoatsume.model.Chat;
import com.nekoatsume.model.User;
import com.nekoatsume.model.UserRole;

public interface UserDAO {

    //recupère un utilisateur en fonction de son pseudo
    public User getUser(String login);

    //recupère un utilisateur en fonction de son id
    public User getUserById(int id);

    //methode d'ajout d'un nouvel utilisateur lors de phase d'inscription
    public void add(User user);

    //update un utilisateur si ce dernier décide changer de mot de passe ou d'adresse mail
    public void edit(User user);

    //recupère tous les utilisateurs inscrits
    public List<User> listeUser();

    //permet a l'admin de bannir un utilisateur
    public void bannirUser(User user);

    //permet a l'admin de debannir un utilisateur
    public void revaliderUser(User user);

    //recupère un utilisateur grace a son email
    public User findByEmail(String mail);

    public UserRole getByUserId(int id);
}
