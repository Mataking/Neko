package com.nekoatsume.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nekoatsume.dao.ChatDAO;
import com.nekoatsume.model.Chat;

//déclaration du webservice chatService, lié avec ChatDAO

/**
 *
 * @author Mata
 */
@Service("chatService")
@Transactional
public class ChatServiceImpl implements ChatService {

    @Autowired
    private ChatDAO chatDAO;

    /**
     *
     * @param nom
     * @return
     */
    public Chat rechercherParNom(String nom) {
        return chatDAO.rechercheParNom(nom);
    }

    /**
     *
     * @return
     */
    public List<Chat> listeChat() {
        return chatDAO.listeChat();
    }

    /**
     *
     * @return
     */
    @Override
    public List<Chat> listeChatRare() {
        return chatDAO.listeChatRare();
    }

    /**
     *
     * @return
     */
    @Override
    public List<Chat> listeChatCommun() {
        return chatDAO.listeChatCommun();
    }

    /**
     *
     * @param chat
     */
    @Override
    public void addChat(Chat chat) {
        chatDAO.add(chat);
    }

    /**
     *
     * @param chat
     */
    @Override
    public void validChat(Chat chat) {
        chatDAO.validerChat(chat);
    }

    /**
     *
     * @param id
     * @return
     */
    @Override
    public Chat getChatById(int id) {
        return chatDAO.getChatById(id);
    }

    /**
     *
     * @return
     */
    @Override
    public List<Chat> listeChatAdmin() {
        return chatDAO.listeChatAdmin();
    }
}
