package views;

import utils.Console;
import controllers.FolhaPagamentoController;
import controllers.FuncionarioController;
import models.FolhaPagamento;
import models.Funcionario;

public class CadastrarFolhaPagamento {

    public void renderizar(){
    
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        FuncionarioController funcionarioController = new FuncionarioController();
        FolhaPagamentoController folhaPagamentoController = new FolhaPagamentoController();

        System.out.println("\n\n ---- Cadastrar Folha de Pagamento ---- ");

        String cpfFuncionario = Console.readString("\n Digite o CPF do funcionário: ");
        Funcionario funcionario = funcionarioController.buscarPorCpf(cpfFuncionario);
        if(funcionario != null){
            folhaPagamento.setFuncionario(funcionario);
            System.out.println("\n CPF Encontrado! \n");
            folhaPagamento.setMes(Console.readInt("Digite o mês da folha de pagamento: "));
            folhaPagamento.setAno(Console.readInt("Digite o ano da folha de pagamento: "));
            folhaPagamento.setNumeroDeHorasTrab(Console.readInt("Digite a quantidade de horas trabalhadas: "));
            folhaPagamento.setValorHora(Console.readDouble("Digite o valor por hora trabalhada: "));
            folhaPagamentoController.cadastrar(folhaPagamento);
            System.out.println("\n ---- Folha de Pagamento cadastrada com Sucesso! ---- \n");
        } else {
            System.out.println("-------CPF de funcionário não encontrado!-------" );
        }
    
    }
    
}
