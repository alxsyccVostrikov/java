/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Arrays;

/**
 *
 * @author home
 */
public class Generica{

    
    public String QuemSouEu(){
    return this.getClass().getSimpleName();
    }

    
     conexao con = new conexao();
    PreparedStatement stmt;
    
    

        public void InserirDados(){
    try{	
	stmt = con.conectando().prepareStatement("insert into "+QuemSouEu()+" ("+column()+") values ("+interr()+")");
PreparedStatement ps=con.conectando().prepareStatement("select * from "+QuemSouEu()+"");
ResultSet rs=ps.executeQuery();
ResultSetMetaData rsmd=rs.getMetaData();

        
       for(byte i=0;i<QuantColumn();i++)//{
      for(byte j=0;j<QuantColumn();j++)//{
       if(camposDivididos()[i].equalsIgnoreCase(VarsComBidi()[0][j]))
            if(rsmd.getColumnTypeName(i+1).equalsIgnoreCase("float"))
            stmt.setFloat(i+1,Float.parseFloat(VarsComBidi()[1][j]));
       else
            stmt.setString(i+1,VarsComBidi()[1][j]);
        stmt.execute();
        stmt.close();
	System.out.println(QuemSouEu()+":Gravado!");
	con.conectando().close();   
    }

catch (SQLException e) {
}
    }//fim metódo InserirDados

    
    public byte QuantColumn(){
    byte i=0;
            try{
PreparedStatement ps=con.conectando().prepareStatement("select * from "+QuemSouEu()+"");
ResultSet rs=ps.executeQuery();
ResultSetMetaData rsmd=rs.getMetaData();


i=(byte) rsmd.getColumnCount();
            }
    catch(SQLException e){
    }
        return i;
    }//fim metódo QuantColumn
    

  public String[][] VarsComBidi(){
     if(QuemSouEu().equals("pessoa")) {
      pessoa p1 = new pessoa();
     String n[][]={camposDivididos(),p1.vars()};
     byte t1=(byte)n.length;
     byte t2=0;
     String nms[][]=n;
  return n;}
     else{
      produto prod = new produto();
     String n[][]={camposDivididos(),prod.vars()};
     byte t1=(byte)n.length;
     byte t2=0;
     String nms[][]=n;
  return n;
     }
      }//fim da classe VarsComBidimen()
    
    
    /*
    prenenche  nom edos campos para insera~~o dos dados.
    ex. (nome,prod,desc)
    */
    public String column(){
        String nms="";
            try{
PreparedStatement ps=con.conectando().prepareStatement("select * from "+QuemSouEu()+"");
ResultSet rs=ps.executeQuery();
ResultSetMetaData rsmd=rs.getMetaData();

    for(byte j=1;j<=QuantColumn();j++)
        if(j==QuantColumn())
    nms+=rsmd.getColumnName(j);
            else
    nms+=rsmd.getColumnName(j)+",";
            }    

            catch(SQLException e){
    }
return nms;
}//fim metódo columns
    
/*
    quantidade de parametro correspondente ao qquantiddae de campo no banco
    ex. vlues(?,?,?)
    */
 public String interr(){
 String interr="?";
 
 for(byte j=1;j<=QuantColumn();j++)
        if(j==QuantColumn())
    interr+="";
            else
    interr+=",?";
 return interr;
 }//fim metodo interr   
    
 //do banco para consulta
 public String[] camposDivididos(){
String[] args=column().split("[,]");
return args;
       //return Arrays.toString(args);
}//fim metódo camposDivididos

 //da classe para consulta
public String[] camposDivididos2(String vars){
String[] args=vars.split(",");
return args;
}//fim da classe camposDivididos2


public String[] camposDivididos3(String[] vars){
String[] args=vars;
return args;
}


public String[] ordenadosColumn(String... vars){
String[] strNames = vars;
 
        //sort String array using sort method
        Arrays.sort(strNames);

    return vars;
}//fim classe ordenados



public String[] variaveisDaClasse2(String vars){
String[] variaveis={vars};
String v1[]=variaveis;
Arrays.sort(variaveis);
return variaveis;
}//fim metódo variaveisDaClasse2




}//fim class generica