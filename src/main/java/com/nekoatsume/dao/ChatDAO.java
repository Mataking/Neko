package com.nekoatsume.dao;

import java.util.List;

import com.nekoatsume.model.Chat;

/**
 *
 * @author Mata
 */
public interface ChatDAO {

    //recupère la liste de tous des chats de la bdd

    /**
     *
     * @return
     */
    List<Chat> listeChat();

    //liste des chats que doit valider l'admin pour les mettre en ligne

    /**
     *
     * @return
     */
    List<Chat> listeChatAdmin();

    //permet de chercher un chat spécifique dans la barre de recherche du site

    /**
     *
     * @param nom
     * @return
     */
    Chat rechercheParNom(String nom);

    //recupère seulement la liste des chats rares

    /**
     *
     * @return
     */
    List<Chat> listeChatRare();

    //recupère seulement la liste des chats communs

    /**
     *
     * @return
     */
    List<Chat> listeChatCommun();

    //permet l'ajout d'un chat

    /**
     *
     * @param chat
     */
    public void add(Chat chat);

    //permet a l'utilisateur de valider l'ajout d'un chat

    /**
     *
     * @param chat
     */
    public void validerChat(Chat chat);

    //

    /**
     *
     * @param id
     * @return
     */
    public Chat getChatById(int id);
}
