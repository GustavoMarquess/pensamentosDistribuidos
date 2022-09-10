/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exavaliativo;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.sql.Date;

public class Client{
	public static void main(String[] args) {
		try {
			Socket cliente = new Socket("localhost", 8080);
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
			String pensamentos = (String) entrada.readUTF();
			System.out.println("Mensagem Recebida: " + pensamentos);
			entrada.close();
			System.out.println("Conectado com Sucesso!");
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		}
	}
}
