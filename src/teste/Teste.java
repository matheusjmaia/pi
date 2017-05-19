
package teste;

import java.util.Random;


public class Teste {
public static String[][] criaTabuleiro() {
        String[][] tabuleiro = new String[6][7];

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                tabuleiro[i][j] = " ";
            }
        }

        return tabuleiro;
    }

    public static void mostraTabuleiro(String[][] tabuleiro) {
        System.out.println();
        System.out.println("+---+---+---+---+---+---+---+");
        for (int i = 0; i < tabuleiro.length; i++) {
            System.out.print("|");
            for (int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(" " + tabuleiro[i][j] + " |");
            }
            System.out.println();
            System.out.println("+---+---+---+---+---+---+---+");
        }
        System.out.println("  A | B | C | D | E | F | G");
    }
    
    public static int sortearNavio (){
     
     Random rng = new Random ();
     int posicao = rng.nextInt(6); 
     return posicao;
    }
    
    public static void atualizaTabuleiro (String[][] tabuleiro){
       for (int i = 0; i < 4; i++){
        int linha =  sortearNavio();
        int coluna = sortearNavio();
        int [][] localdonavio = new int [4][4];
        
        localdonavio = localdonavio[linha][coluna];
        
        
        tabuleiro[linha][coluna]= navio();
        
       }
        
    }
   
    public static String navio(){
        String navio = "N";
        
    return navio;
    }


    public static void main(String[] args) {
        String t[][] = criaTabuleiro();
        
        mostraTabuleiro(t);    
        
        atualizaTabuleiro(t);
        
        mostraTabuleiro(t);
    }
    
}
