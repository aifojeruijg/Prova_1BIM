package controllers;
import models.FolhaPagamento;
import java.util.ArrayList;

public class FolhaPagamentoController {

        private static ArrayList<FolhaPagamento> folhaPagamentos =new ArrayList<FolhaPagamento>();
    
        public void cadastrar(FolhaPagamento folhaPagamento){
            folhaPagamentos.add(folhaPagamento);
        }
    
        public ArrayList<FolhaPagamento> listar() {
            return folhaPagamentos;
        }

        public FolhaPagamento buscarPorMes(int mes){
            for (FolhaPagamento folhaPagamentoLista : folhaPagamentos){
                if(folhaPagamentoLista.getMes() == (mes)){
                    return folhaPagamentoLista;
                }
            }
            return null;
        }

        public FolhaPagamento buscarPorAno(int ano){
            for (FolhaPagamento folhaPagamentoLista : folhaPagamentos){
                if(folhaPagamentoLista.getAno() == (ano)){
                    return folhaPagamentoLista;
                }
            }
            return null;
        }

        
}
