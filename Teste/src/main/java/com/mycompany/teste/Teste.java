
package com.mycompany.teste;


public class Teste {


    public int metodoSOMA( int numero1 ,int numero2 ){
       
   int soma = numero1 + numero2;
   
   return soma;
              
           
        
    }
    
    
    public int metodoSUB( int numero1 ,int numero2 ){

        int sub = numero1 - numero2;

        return sub;
    

    }
    
     public int metodoDIVISAO(int numero1,int numero2){
         try{
        int DIV = numero1 / numero2;
         return DIV;
        
         }catch (Exception ex){
             throw new ArithmeticException("Nao é possivel divir por zero");
         }
       
    }
     
    
      public int metodoMULTIPLICACAO(  int numero1,int numero2 ){
 
        int MULTI = numero1 * numero2;

        return MULTI;
        
       
    }
    
    
    
    public static void main(String[] args) {
             
    }
}
