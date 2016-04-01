package com.nekoatsume.dao;

import java.util.List;

import com.nekoatsume.model.Chat;

public interface ChatDAO {

    //recupère la liste de tous des chats de la bdd
    List<Chat> listeChat();

    //liste des chats que doit valider l'admin pour les mettre en ligne
    List<Chat> listeChatAdmin();

    //permet de chercher un chat spécifique dans la barre de recherche du site
    Chat rechercheParNom(String nom);

    //recupère seulement la liste des chats rares
    List<Chat> listeChatRare();

    //recupère seulement la liste des chats communs
    List<Chat> listeChatCommun();

    //permet l'ajout d'un chat
    public void add(Chat chat);

    //permet a l'utilisateur de valider l'ajout d'un chat
    public void validerChat(Chat chat);

    //
    public Chat getChatById(int id);
}
