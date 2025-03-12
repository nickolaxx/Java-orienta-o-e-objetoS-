package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Escolha uma opção");
            System.out.print("1. cadastrar");
            System.out.print("2. pesquisar");
            System.out.print("3. listar");
            System.out.print("4. Finalizar");
            opcao = sc.nextInt();
            if(opcao < 1 || opcao > 4) {
                System.out.println("opção invalida");
            }
            else {
                switch (opcao) {
                    case 1:
                        cadastrar();
                        break;
                    case 2:
                        pesquisar();
                        break;
                    case 3:
                        listar();
                }
            }
            System.out.println("----------------");
        }while (opcao != 4);

    }
    public static void cadastrar() {

    }
    public static void pesquisar() {

    }
    public static void listar() {

    }


    }

