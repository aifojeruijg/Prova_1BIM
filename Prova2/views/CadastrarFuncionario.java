package views;
import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {
    
    public void renderizar(){
        Funcionario funcionario = new Funcionario();
        FuncionarioController funcionarioController = new FuncionarioController();

        System.out.println(" ---- Cadastro de Funcionários ---- ");
        funcionario.setNome(Console.readString("\n Digite o nome do Funcionário: "));
        funcionario.setCpf(Console.readString(" Digite o CPF do Funcionário: "));
        funcionarioController.cadastrar(funcionario);
        System.out.println("\n\n ----- Funcionário Cadastrado com Sucesso! ----- \n\n");
    }
}
