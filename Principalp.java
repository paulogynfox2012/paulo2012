/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleEstoque;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author FOX
 */
public class Principalp {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        ArrayList <Estoque> Estoques = new ArrayList ();
        
        Estoque Produto1 = new Estoque ("Calça","Azul Claro","Disel","15","40","25102019");
        Estoque Produto2 = new Estoque ("Calça","Azul Claro","Disel","20","42","25102019");
        Estoque Produto3 = new Estoque ("Calça","Azul Claro","Disel","15","44","25102019");
        
        Estoque Produto4 = new Estoque ("Bermuda","Azul Claro","Disel","5","40","15102019");
        Estoque Produto5 = new Estoque ("Bermuda","Azul Claro","Disel","10","42","12102019");
        Estoque Produto6 = new Estoque ("Bermuda","Azul Claro","Disel","8","44","10102019");
        
        Estoque Produto7 = new Estoque ("Calça","Azul Escuro","Disel","10","40","25102019");
        Estoque Produto8 = new Estoque ("Calça","Azul Escuro","Disel","30","42","25102019");
        Estoque Produto9 = new Estoque ("Calça","Azul Escuro","Disel","45","44","25102019");
        
        Estoque Produto10 = new Estoque ("Bermuda","Azul Escuro","Disel","2","40","15102019");
        Estoque Produto11 = new Estoque ("Bermuda","Azul Escuro","Disel","3","42","12102019");
        Estoque Produto12 = new Estoque ("Bermuda","Azul Escuro","Disel","15","44","10102019");
        
        
        
        
        Estoque Produto13 = new Estoque ("Calça","Azul Claro","Calvin Klein","45","40","25102019");
        Estoque Produto14 = new Estoque ("Calça","Azul Claro","Calvin Klein","55","42","25102019");
        Estoque Produto15 = new Estoque ("Calça","Azul Claro","Calvin Klein","10","44","25102019");
        
        Estoque Produto16 = new Estoque ("Bermuda","Azul Claro","Calvin Klein","25","40","15102019");
        Estoque Produto17 = new Estoque ("Bermuda","Azul Claro","Calvin Klein","15","42","12102019");
        Estoque Produto18 = new Estoque ("Bermuda","Azul Claro","Calvin Kleinl","12","44","10102019");
        
        Estoque Produto19 = new Estoque ("Calça","Azul Escuro","Calvin Klein","20","40","25102019");
        Estoque Produto20 = new Estoque ("Calça","Azul Escuro","Calvin Klein","15","42","25102019");
        Estoque Produto21 = new Estoque ("Calça","Azul Escuro","Calvin Klein","10","44","25102019");
        
        Estoque Produto22 = new Estoque ("Bermuda","Azul Escuro","Calvin Klein","5","40","15102019");
        Estoque Produto23 = new Estoque ("Bermuda","Azul Escuro","Calvin Klein","10","42","12102019");
        Estoque Produto24 = new Estoque ("Bermuda","Azul Escuro","Calvin Kleinl","8","44","10102019");
        
        
        Estoque Produto25 = new Estoque ("Calça","Azul Claro","Giorgio Armani","15","40","25102019");
        Estoque Produto26 = new Estoque ("Calça","Azul Claro","Giorgio Armani","65","42","25102019");
        Estoque Produto27 = new Estoque ("Calça","Azul Claro","Giorgio Armani","5","44","25102019");
        
        Estoque Produto28 = new Estoque ("Bermuda","Azul Claro","Giorgio Armani","3","40","15102019");
        Estoque Produto29 = new Estoque ("Bermuda","Azul Claro","Giorgio Armani","10","42","12102019");
        Estoque Produto30 = new Estoque ("Bermuda","Azul Claro","Giorgio Armani","11","44","10102019");
        
        Estoque Produto31 = new Estoque ("Calça","Azul Escuro","Giorgio Armani","22","40","25102019");
        Estoque Produto32 = new Estoque ("Calça","Azul Escuro","Giorgio Armani","18","42","25102019");
        Estoque Produto33 = new Estoque ("Calça","Azul Escuro","Giorgio Armani","33","44","25102019");
        
        Estoque Produto34 = new Estoque ("Bermuda","Azul Escuro","Giorgio Armani","26","40","15102019");
        Estoque Produto35 = new Estoque ("Bermuda","Azul Escuro","Giorgio Armani","35","42","12102019");
        Estoque Produto36 = new Estoque ("Bermuda","Azul Escuro","Giorgio Armani","32","44","10102019");
        
        Estoques.add(Produto1);
        Estoques.add(Produto2);
        Estoques.add(Produto3);
        Estoques.add(Produto4);
        Estoques.add(Produto5);
        Estoques.add(Produto6);
        Estoques.add(Produto7);
        Estoques.add(Produto8);
        Estoques.add(Produto9);
        Estoques.add(Produto10);
        Estoques.add(Produto11);
        Estoques.add(Produto12);
        Estoques.add(Produto13);
        Estoques.add(Produto14);
        Estoques.add(Produto15);
        Estoques.add(Produto16);
        Estoques.add(Produto17);
        Estoques.add(Produto18);
        Estoques.add(Produto19);
        Estoques.add(Produto20);
        Estoques.add(Produto21);
        Estoques.add(Produto22);
        Estoques.add(Produto23);
        Estoques.add(Produto24);
        Estoques.add(Produto25);
        Estoques.add(Produto26);
        Estoques.add(Produto27);
        Estoques.add(Produto28);
        Estoques.add(Produto29);
        Estoques.add(Produto30);
        Estoques.add(Produto31);
        Estoques.add(Produto32);
        Estoques.add(Produto33);
        Estoques.add(Produto34);
        Estoques.add(Produto35);
        Estoques.add(Produto36);
        
        for(Estoque Estq : Estoques){
            System.out.println(Estq);
        }
            System.out.println("Total de Produtos"+Estoques.size());
        }
        
    }
        
        
    
    

