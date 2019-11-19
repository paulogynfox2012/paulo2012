/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControleEstoque;

/**
 *
 * @author FOX
 */
public class Produto {
    
   private String Tp,cor,marca,Qntd,num,dtE;

    public Produto(String Tp, String cor, String marca, String Qntd, String num, String dtE) {
        this.Tp = Tp;
        this.cor = cor;
        this.marca = marca;
        this.Qntd = Qntd;
        this.num = num;
        this.dtE = dtE;
    }
   

           
    public Produto (){
            
        }

    public String getTp() {
        return Tp;
    }

    public void setTp(String Tp) {
        this.Tp = Tp;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getQntd() {
        return Qntd;
    }

    public void setQntd(String Qntd) {
        this.Qntd = Qntd;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDtE() {
        return dtE;
    }

    public void setDtE(String dtE) {
        this.dtE = dtE;
    }

    
    }

