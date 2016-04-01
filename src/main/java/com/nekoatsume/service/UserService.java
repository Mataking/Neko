package com.nekoatsume.service;

import java.util.List;

import com.nekoatsume.model.User;
import com.nekoatsume.model.UserRole;
//joue le rôle du webservice pour les fonctions dédié pour les utilisateurs

public interface UserService {

    public User getUser(String login);

    public User getUserById(int id);

    public UserRole getByUserId(int id);

    public void addUser(User user);

    public void editUser(User user);

    void updateUser(User user);

    public List<User> listeUser();

    public void bannirUser(User user);

    public void revaliderUser(User user);

    public User findByEmail(String mail);
}
