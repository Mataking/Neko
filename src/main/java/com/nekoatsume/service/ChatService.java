package com.nekoatsume.service;

import java.util.List;

import com.nekoatsume.model.Chat;
import com.nekoatsume.model.User;

//joue le rôle du webservice pour les fonctions dédié pour les chats

/**
 *
 * @author Mata
 */
public interface ChatService {

    /**
     *
     * @param nom
     * @return
     */
    Chat rechercherParNom(String nom);

    /**
     *
     * @return
     */
    List<Chat> listeChat();

    /**
     *
     * @return
     */
    List<Chat> listeChatAdmin();

    /**
     *
     * @return
     */
    List<Chat> listeChatRare();

    /**
     *
     * @return
     */
    List<Chat> listeChatCommun();

    /**
     *
     * @param chat
     */
    public void addChat(Chat chat);

    /**
     *
     * @param chat
     */
    public void validChat(Chat chat);

    /**
     *
     * @param id
     * @return
     */
    public Chat getChatById(int id);
}
