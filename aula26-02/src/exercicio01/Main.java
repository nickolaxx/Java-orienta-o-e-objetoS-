package exercicio01;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();

        //entrada de dados
        System.out.println("Insira o nome do jogador: ");
        jogador.nome = sc.nextLine();
        System.out.println("Pontuação: ");

        //laço de repetição
            for(int i = 0; i < jogador.score.length; i++){
            System.out.print("Rodada" + (i+1) + ": ");
            jogador.score[i] = sc.nextInt();
        }

            //saoda de dadps
        System.out.println("");
        System.out.println("Jogador: " + jogador.nome);
        System.out.println("Pontuação total: " + jogador.calcularScoreTotal());

    }
}