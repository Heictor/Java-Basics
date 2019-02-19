/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplepackage;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class JOption {
    public static void main(String[] args){
        
        String nome, email;
        int idade;
        double altura, peso;
        
        nome = JOptionPane.showInputDialog("Digite seu nome: ");
        email = JOptionPane.showInputDialog("Digite seu email: ");
        idade = Integer.parseInt(
                JOptionPane.showInputDialog("Digite sua idade: "));
        peso = Double.parseDouble(
                JOptionPane.showInputDialog("Digite seu peso: "));
        altura = Double.parseDouble(
                JOptionPane.showInputDialog("Digite sua altura: "));
        
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\n"+"Idade: "
                +idade+"\n"+"Altura: "+altura+"\n"+"Peso: "+peso
                +"\nEmail:"+email);
        
    }
    
}