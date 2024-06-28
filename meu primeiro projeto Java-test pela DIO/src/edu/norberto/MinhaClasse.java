package edu.norberto;
public class MinhaClasse {
    
    public static void main (String [] args) {
        
        //criando as variváeis
        String primeiroNome = "Norberto";
        String segundoNome = "David";

        //chamando o método e atribuindo a uma variável
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        //printando o valor da variável
        System.out.println(nomeCompleto);

    }

    //método ou function
    public static String nomeCompleto(String nome1, String nome2) {
        return "Resultado: " + nome1.concat(" ").concat(nome2);
    }
    
}
