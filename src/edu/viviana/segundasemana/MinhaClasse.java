package edu.viviana.segundasemana;
public class MinhaClasse {
public static void main (String [] args){

    int ano = 2021; //pode sofrer alterações
    ano = 2022;

    final String BR = "Brasil";//a palavra "final" não permite alterações.

    String primeiroNome = "Viviana";
    String segundoNome = "Andrade";
    
    String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
    System.out.println(nomeCompleto);
}

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do Metodo:"+segundoNome.concat(" ").concat(segundoNome);
   
}

}

