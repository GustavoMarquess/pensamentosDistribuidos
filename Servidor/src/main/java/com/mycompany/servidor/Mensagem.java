/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor;

import java.util.ArrayList;


/**
 *
 * @author Laboratorio
 */

public class Mensagem {
    int index;  
    ArrayList<String> messages = new ArrayList<String>();
    
    public Mensagem() {
                messages.add("O sucesso é um professor traiçoeiro. Ele seduz pessoas inteligentes e as faz pensar que elas não podem perder tudo| Autor Bill Gates");
                
                messages.add("Seu tempo é limitado. Não gaste seu tempo vivendo a vida de outra pessoa.| Autor Autor Steve Jobs");

                messages.add("Tentei fugir de mim, mas onde eu ia eu estava.| Autor Tiririca");

                messages.add("Data da publicação:09.09.2022 as 19:18");                       
    }    
   
    public String enviaMensagens(){     
     index = (int)(Math.random() * messages.size());    
     return messages.get(index);
 }
                
}
