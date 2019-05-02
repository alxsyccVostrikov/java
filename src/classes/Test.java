/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import design.Adicionar;

/**
 *
 * @author home
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Adicionar ad = new Adicionar();
        System.out.println("little test:"+ad.getMainLabel());
    //vetor();
    byte a=(byte)1;
    byte b=(byte)2;
    //soma(a=b,b);
    }
    
    public static void vetor(){
    String nm[]={"liu-keng","alxsy"};
        for(String x : nm)
    System.out.println("Desenvolvedor:"+x);
    System.out.println("Desenvolvedores:");
        for(String x : nm)
    System.out.print(x+",");
    }
    
    public static void soma(byte a,byte b){
        System.out.println("valores:"+a+":a,b:"+b);
    }
    
    public static void optional(byte x,byte y){
    if(Byte.toString(y)=="" || Byte.toString(y)==null)
    y=0;
    
        System.out.println("valore obg:"+x+"valor op:"+y);
    }
}//fim main
