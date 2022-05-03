package views;
import utils.Console;
public class Principal {

        public static void main (String[] args){
    
            int opc = 0;
    
            do {
                System.out.println(" ______________________________________________");
                System.out.println("|                    M E N U                   |");
                System.out.println("|   1 - Cadastrar Funcionário                  |");
                System.out.println("|   2 - Cadastrar Folha de pagamento           |");
                System.out.println("|   3 - Consultar Folha de pagamento           |");
                System.out.println("|   4 - Consultar TODAS as folhas de pagamento |");
                System.out.println("|                  0 - S A I R                 |");
                System.out.println("|______________________________________________|");
                opc = Console.readInt("Digite a opção desejada: ");
    
                switch(opc){
                    case 1:
                        CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                        cadastrarFuncionario.renderizar();
                    break;
                    
                    case 2:
                        CadastrarFolhaPagamento cadastrarFolhaPagamento = new CadastrarFolhaPagamento();
                        cadastrarFolhaPagamento.renderizar();
                    break;

                    case 3:
                        ConsultarFolhaPagamento consultarFolhaPagamento =  new ConsultarFolhaPagamento();
                        consultarFolhaPagamento.renderizar();
                    break;

                    case 4:
                        ListarTodasFolhas listarTodasFolhas = new ListarTodasFolhas();
                        listarTodasFolhas.renderizar();
                    break;
    
                    case 0:
                        System.out.println("\n\n Saindo... \n\n");
                    break;
    
                    default: System.out.println(" ---- Opção Inválida ----");
                }
            }while(opc != 0);
        }
    }


