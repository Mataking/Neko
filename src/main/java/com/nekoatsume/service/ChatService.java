package com.nekoatsume.service;

import java.util.List;

import com.nekoatsume.model.Chat;
import com.nekoatsume.model.User;

//joue le rôle du webservice pour les fonctions dédié pour les chats
public interface ChatService {

    Chat rechercherParNom(String nom);

    List<Chat> listeChat();

    List<Chat> listeChatAdmin();

    List<Chat> listeChatRare();

    List<Chat> listeChatCommun();

    public void addChat(Chat chat);

    public void validChat(Chat chat);

    public Chat getChatById(int id);
}
