//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Criação da lista contendo os elementos ditos:

        int [] Lista = {5,3,6,7,14,17,21};
        boolean ElementoEncontrado = false;
       for(int i=0; i<Lista.length; i++){
           if(Lista[i]==14){
               System.out.println("O elemento 14 está na lista e pertence ao índice: " + i);
             break;

           }
           else {
               System.out.println("O elemento não está na lista!!!");
           }
       }
    }

    }