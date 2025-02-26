package exercicio01;

public class Jogador {
        //atribuos ou variaveis de istancia
        String nome;
        int[] score = new int[3];


        //método para calcular e retornar o score total
        public int calcularScoreTotal() {
            int total = 0;
            for(int i : score) {
                total += i;
            }
            return total;
        }
    }

