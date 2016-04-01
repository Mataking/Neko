package com.nekoatsume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nekoatsume.dao.ChatDAO;
import com.nekoatsume.model.Chat;

//déclaration du webservice chatService, lié avec ChatDAO
@Service("chatService")
@Transactional
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatDAO chatDAO;

    public Chat rechercherParNom(String nom) {
        return chatDAO.rechercheParNom(nom);
    }

    public List<Chat> listeChat() {
        return chatDAO.listeChat();
    }

    @Override
    public List<Chat> listeChatRare() {
        return chatDAO.listeChatRare();
    }

    @Override
    public List<Chat> listeChatCommun() {
        return chatDAO.listeChatCommun();
    }

    @Override
    public void addChat(Chat chat) {
        chatDAO.add(chat);
    }

    @Override
    public void validChat(Chat chat) {
        chatDAO.validerChat(chat);
    }

    @Override
    public Chat getChatById(int id) {
        return chatDAO.getChatById(id);
    }

    @Override
    public List<Chat> listeChatAdmin() {
        return chatDAO.listeChatAdmin();
    }
}
