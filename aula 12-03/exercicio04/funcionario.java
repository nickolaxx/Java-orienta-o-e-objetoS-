package exercicio04;

public class funcionario {
    String nome;
    String cargo;
    double salario;

    //metodo construtor para inicializar os atributos do objeto
        public funcionario(String nome,String cargo, double salario) {
            this.nome = nome;
            this.cargo = cargo;
            this.salario = salario;

        }


    //metodo para aumentar ao salario de acordo com uma porcentagem
         public void aumentarSalario(double porcentagem) {
            salario += salario * porcentagem / 100;
    }

    //metodo para aumentar ao salario de acordo com uma porcentagem
        public void aumentarSalario(String cargo, double porcentagem) {
        if(this.cargo.equalsIgnoreCase(cargo)) {
            salario += salario * porcentagem / 100;
        }
    }

    //metodo para promover um funcionario -->
    public void promover(String novoCargo) {
             cargo = novoCargo;
    }

}



