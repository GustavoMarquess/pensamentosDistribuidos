/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.servidor;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Date;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Laboratorio
 */
public class Servidor {
    public static void main(String[] args) {    
        Mensagem mensagem = new Mensagem();       
		try {
			ServerSocket servidor = new ServerSocket(8080);
			System.out.println("Estou respondendo na porta 8080");
			while (true) {			
				Socket socket = servidor.accept();
				System.out.println("Cliente Online: " + socket.getInetAddress().getHostAddress());				
                                ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
				saida.flush();                                                                    
                                saida.writeUTF(mensagem.enviaMensagens());
				saida.close();
				socket.close();
			}
                }
		 catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}        
}
/*


public class Servidor {
	public static void main(String[] args) throws UnknownHostException {
            String ipDaMaquina = InetAddress.getLocalHost().getHostAddress();
            int index;
            DateTimeFormatter parser = DateTimeFormatter.ofPattern("dd/MM/uuuu");
            ArrayList<String> messages = new ArrayList<String>();
                messages.add("Hora certa: " +  new SimpleDateFormat("dd/MM/yyyy").format(new Date(0)));
                messages.add("Hoje é dia: " + new SimpleDateFormat("dd/MM/yyyy").format(new Date(0)));
                messages.add("Sou um servidor de mensagens. ");
                messages.add("Estou hopedado no IP " + ipDaMaquina);
                messages.add("Só trabalho nos dias ímpares.");
                messages.add("Puts, você só sabe me requisitar...");
                messages.add("Chega!!! Não te respondo mais.");
                messages.add("Servidor TCP desenvolvido em Java.");
                messages.add("Dia da semana: " + DayOfWeek.from(parser.parse( new SimpleDateFormat("dd/MM/yyyy").format(new Date(0)))));
            
		try {
			ServerSocket servidor = new ServerSocket(9000);
			System.out.println("Estou respondendo na porta 9000");
			while (true) {
				// o método accept() bloqueia a execução até que
				// o servidor receba um pedido de conexão
				Socket socket = servidor.accept();
				System.out.println("Cliente conectado: " + socket.getInetAddress().getHostAddress());
				//ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
                                ObjectOutputStream saida = new ObjectOutputStream(socket.getOutputStream());
				saida.flush();
                                //saida.writeObject(new Date);
                                //saida.writeChars("Resposta do servidor");
                                index = (int)(Math.random() * messages.size());
				saida.writeUTF(messages.get(index));
				saida.close();
				socket.close();
			}
                }
		 catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
        }
*/