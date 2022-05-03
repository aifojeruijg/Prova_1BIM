package views;
import utils.Console;

import controllers.FolhaPagamentoController;
import controllers.FuncionarioController;
import models.FolhaPagamento;
import models.Funcionario;

public class ConsultarFolhaPagamento {

    double salarioBruto;

    public void renderizar(){
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        FuncionarioController funcionarioController = new FuncionarioController();
       
        FolhaPagamentoController folhadePagamentoController = new FolhaPagamentoController();
        
        System.out.println("\n\n ---- Consultar Folha de pagamento ---- ");

        String cpfFuncionario = Console.readString("\n Digite o CPF do funcionário: ");
        Funcionario funcionario = funcionarioController.buscarPorCpf(cpfFuncionario);
        if(funcionario != null){
            folhaPagamento.setFuncionario(funcionario);
            int mes = Console.readInt("Qual o mês da folha de pagamento? ");
            folhaPagamento.setMes(mes);
            folhaPagamento = folhadePagamentoController.buscarPorMes(mes);

            if (folhaPagamento != null){
                int ano= Console.readInt("Qual o ano do pagamento? ");
                folhaPagamento.setAno(ano);
                folhadePagamentoController.buscarPorAno(ano);
                
                if (folhaPagamento != null){
                    System.out.println(folhaPagamento);
                }

            }else {
                System.out.println("mês não encontrado");
            }
        } else {
            System.out.println("-------CPF de funcionário não encontrado!-------" );
        }
    
    }
   
}
   

