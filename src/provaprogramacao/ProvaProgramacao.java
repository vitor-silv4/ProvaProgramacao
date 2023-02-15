package provaprogramacao;

import java.util.Scanner;
import java.util.Arrays;
import static provaprogramacao.Embaralhador.embaralhar;


public class ProvaProgramacao {

    public static void main(String[] args) {
        String resp;
        do{ 
            System.out.println("Digite os 24 numeros: ");
        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[24];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }

        System.out.print("Antes de embaralhar: ");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println();

        embaralhar(numeros); //Método embaralhar() - criado em outra classe Java "Embaralhador"
        
        System.out.print("Depois de embaralhar: ");
        for (int n : numeros) {
            System.out.print(n + " ");

        }

        System.out.println();
                
        
        int a1[] = Arrays.copyOfRange(numeros, 0, 12);
        int a2[] = Arrays.copyOfRange(numeros, 12, 24);    
                
        System.out.print("Jogador 1: ");
        for (int n : a1) {
            System.out.print(n + " ");
        }
        
        System.out.println();
        
        System.out.print("jogador 2: ");
        for (int n : a2) {
            System.out.print(n + " ");
        }
        
        System.out.println();
        
        int j1 = 0;
        int j2 = 0;
        int tot1 = 0;
        int tot2 = 0;
        Scanner t = new Scanner(System.in);
        String continuar;
        
        System.out.println("Digite [c] para continuar [s] sair");
        continuar = t.nextLine();
        
        switch(continuar) {
            case "c":
                
                for(int i = 0; i < a1.length; i++){
                    j1 = a1[i];
                    j2 = a2[i];
                    if(j1 < j2) {
                        tot1 ++;
                    } else if(j2 < j1) {
                        tot2 ++;
                    } else if (j2 == j1) {
                        if (a1[i-1] > a2[i-1]){
                            tot1 ++;
                        } else if(a2[i-1] > a1[i-1]){
                            tot2++;
                        } else if(a2[i-1] == a1[i-1]) {
                          continue;  
                        }
                    } 
                }
            break;
            
            default:
                System.out.println("Saindo do jogo...");
        }
        
        System.out.println("Jogador 1 obteve um total de: " + tot1 + " pontos");
        System.out.println("Jogador 2 obteve um total de: " + tot2 + " pontos");
        
        System.out.println("Apertar [s] para sair ou [r] repetir o jogo");
        
        resp = t.nextLine();
        } while(resp.equals("r"));
    }
}
