package com.nekoatsume.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.nekoatsume.model.AjoutAstuce;
import com.nekoatsume.model.Astuce;
import com.nekoatsume.model.Chat;
import com.nekoatsume.model.User;
import com.nekoatsume.service.AstuceService;
import com.nekoatsume.service.ChatService;

//contient les méthodes POST et GET
//controleur pour les fonctions concernant les chats

/**
 *
 * @author Mata
 */
@Controller
public class ChatNavigation {

    @Resource(name = "chatService")
    ChatService chatService;

    @Resource(name = "astuceService")
    AstuceService astuceService;

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/nouveauchat"}, method = RequestMethod.GET)
    public String newChat(ModelMap model) {
        Chat chat = new Chat();
        model.addAttribute("chat", chat);

        return "addChat";
    }

    /**
     *
     * @param chat
     * @param result
     * @param model
     * @return
     */
    @RequestMapping(value = "/nouveauchat", method = RequestMethod.POST)
    public String saveChat(@Valid Chat chat, BindingResult result, ModelMap model) {
        chatService.addChat(chat);
        if (chat.getNom().isEmpty() && chat.getNomJaponais().isEmpty() && chat.getDescription().isEmpty()
                && chat.getPersonnalite().isEmpty() && chat.getRare().toString().isEmpty()) {
            model.addAttribute("msg", true);
            return "addChat";
        }
        return "add-success";
    }

    //récupère toute la liste des chats

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/chats"}, method = RequestMethod.GET)
    public String listChat(Model model) {
        List<Chat> chats = chatService.listeChat();
        model.addAttribute("listechat", chats);
        model.addAttribute("find", false);
        return "chats";
    }

    //récupère la liste des chats rares

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/rare"}, method = RequestMethod.GET)
    public String listChatRare(Model model) {
        List<Chat> chats = chatService.listeChatRare();
        model.addAttribute("listechat", chats);
        model.addAttribute("find", false);
        return "chats";
    }

    //récupère la liste des chats communs

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/communs"}, method = RequestMethod.GET)
    public String listChatCommun(Model model) {
        List<Chat> chats = chatService.listeChatCommun();
        model.addAttribute("listechat", chats);
        model.addAttribute("find", false);
        return "chats";
    }

    //liste pour les chats pour l'administrateurs

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/admin-chats"}, method = RequestMethod.GET)
    public String listChatAdm(Model model) {
        List<Chat> chats = chatService.listeChatAdmin();
        model.addAttribute("listechat", chats);
        model.addAttribute("find", false);
        return "admin-chats";
    }

    //liste des astuces

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/astuces"}, method = RequestMethod.GET)
    public String listAstuce(Model model) {
        List<Astuce> listAstuce = astuceService.getAllAstuce();
        model.addAttribute("listeastuce", listAstuce);
        Astuce astc = new Astuce();
        model.addAttribute("voteplus", astc);
        return "astuce";
    }

    //liste des astuces pour l'administrateur

    /**
     *
     * @param model
     * @return
     */
    @RequestMapping(value = {"/admin-astuces"}, method = RequestMethod.GET)
    public String listAstuceAdm(Model model) {
        List<Astuce> listAstuce = astuceService.getAllAstuce();
        model.addAttribute("listeastuce", listAstuce);
        return "admin-astuces";
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/validerchat-{id}", method = RequestMethod.GET)
    public String validateCat(@PathVariable("id") int id, Model model) {
        Chat chat = chatService.getChatById(id);
        chatService.validChat(chat);
        List<Chat> chats = chatService.listeChatAdmin();
        model.addAttribute("listechat", chats);
        model.addAttribute("find", false);
        return "admin-chats";
    }

    //méthode pour rechercher un chat via son nom

    /**
     *
     * @param nom
     * @param model
     * @return
     */
    @RequestMapping(value = {"/chats"}, method = RequestMethod.POST)
    public String rechercheChat(@RequestParam("searchText") String nom, Model model) {
        Chat chats = chatService.rechercherParNom(nom);
        model.addAttribute("listechat", chats);
        model.addAttribute("find", true);
        return "chats";
    }

    //----------------- DEBUT méthode pour ajouter une astuce à un chat

    /**
     *
     * @param chatnom
     * @param model
     * @return
     */
    @RequestMapping(value = {"/astuce-{chatname}"}, method = RequestMethod.GET)
    public String getCatAstuce(@PathVariable("chatname") String chatnom, Model model) {
        System.out.println(chatnom);
        Chat chats = chatService.rechercherParNom(chatnom);
        model.addAttribute("chat", chats);
        model.addAttribute("astuce", true);

        AjoutAstuce ajoutAstuce = new AjoutAstuce();
        model.addAttribute("ajout", ajoutAstuce);
        List<Astuce> astuce = astuceService.getAstuce(chatnom);
        model.addAttribute("listastuce", astuce);

        Astuce astc = new Astuce();
        model.addAttribute("voteplus", astc);

        return "chats";
    }

    /**
     *
     * @param ajout
     * @param chatnom
     * @param model
     * @return
     */
    @RequestMapping(value = {"/astuce-{chatname}"}, method = RequestMethod.POST)
    public String saveAstuce(@ModelAttribute("ajout") AjoutAstuce ajout, @PathVariable("chatname") String chatnom,
            ModelMap model) {
        astuceService.addAstuce(ajout);
        Chat chats = chatService.rechercherParNom(chatnom);
        model.addAttribute("chat", chats);
        model.addAttribute("astuce", true);
        List<Astuce> astuce = astuceService.getAstuce(chatnom);
        model.addAttribute("listastuce", astuce);
        return "chats";
    }
    //----------------- FIN méthode pour ajouter une astuce à un chat

    //-------------- Début pour les méthodes de vote d'astuce

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = {"/voteplus-{idastuce}"}, method = RequestMethod.POST)
    public String votePlus(@PathVariable("idastuce") int id, Model model) {
        Astuce astc = astuceService.getAstuceById(id);
        astuceService.addPlus(astc);
        Chat chats = chatService.rechercherParNom(astc.getNomchat());
        model.addAttribute("chat", chats);
        model.addAttribute("astuce", true);
        List<Astuce> astuce = astuceService.getAstuce(astc.getNomchat());
        model.addAttribute("listastuce", astuce);
        AjoutAstuce ajoutAstuce = new AjoutAstuce();
        model.addAttribute("ajout", ajoutAstuce);
        return "chats";
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = {"/astuceplus-{idastuce}"}, method = RequestMethod.POST)
    public String astucePlus(@PathVariable("idastuce") int id, Model model) {
        Astuce astc = astuceService.getAstuceById(id);
        System.out.println(astc.getNomchat() + " " + astc.getIdastuce());
        astuceService.addPlus(astc);
        List<Astuce> listAstuce = astuceService.getAllAstuce();
        model.addAttribute("listeastuce", listAstuce);
        return "astuce";
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = {"/votemoins-{idastuce}"}, method = RequestMethod.POST)
    public String voteMoins(@PathVariable("idastuce") int id, Model model) {
        Astuce astc = astuceService.getAstuceById(id);
        astuceService.addMoins(astc);
        Chat chats = chatService.rechercherParNom(astc.getNomchat());
        model.addAttribute("chat", chats);
        model.addAttribute("astuce", true);
        List<Astuce> astuce = astuceService.getAstuce(astc.getNomchat());
        model.addAttribute("listastuce", astuce);
        AjoutAstuce ajoutAstuce = new AjoutAstuce();
        model.addAttribute("ajout", ajoutAstuce);
        return "chats";
    }

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = {"/astucemoins-{idastuce}"}, method = RequestMethod.POST)
    public String astuceMoins(@PathVariable("idastuce") int id, Model model) {
        Astuce astc = astuceService.getAstuceById(id);
        astuceService.addMoins(astc);
        List<Astuce> listAstuce = astuceService.getAllAstuce();
        model.addAttribute("listeastuce", listAstuce);
        return "astuce";
    }
    //-------------- Fin pour les méthodes de vote d'astuce

    //permet de supprimer une astuce

    /**
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/supprimerastuce-{id}")
    public String removeAstuce(@PathVariable("id") int id, Model model) {
        astuceService.deleteAstuce(id);
        List<Astuce> listAstuce = astuceService.getAllAstuce();
        model.addAttribute("listeastuce", listAstuce);
        return "admin-astuces";
    }

}
