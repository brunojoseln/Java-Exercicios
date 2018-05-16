package testesarraylist;

//Não esquecer de importar a biblioteca java.util
import java.util.*;

public class TutorialArrayList {

    
    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();
        
        pessoas.add("Bruno");
        pessoas.add("Carlos");
        pessoas.add("Antonio");
        pessoas.add("José");
        pessoas.add("Ana");
        pessoas.add("Davi");
        pessoas.add("Camila");
        
        System.out.println("Pessoas : "+ pessoas + "\n");
        
        int index;
        index = pessoas.indexOf("Camila");
        
        System.out.println("A posição da Camila é "+ index);
        
        //mostra a posição indicada no vetor
        String nome = pessoas.get(5);
        System.out.println("O 5º nome na lista é: "+nome );
        
        //Conta os valores do array
        System.out.println("A quantidade de pessoas no Array é: "+ pessoas.size());
        
        //Removendo apenas um valor
        pessoas.remove(2);
        System.out.println("Pessoas : "+ pessoas + "\n");
        
        //Clear limpa o ArrayList inteiro
        pessoas.clear();
        
        //Retorna a quantidade de elementos no array
        System.out.println("Pessoas : "+ pessoas + "\n");
       
        //Verifica se está vazio
        System.out.println("O array está vazio? "+ pessoas.isEmpty());
        
    }
    
}
