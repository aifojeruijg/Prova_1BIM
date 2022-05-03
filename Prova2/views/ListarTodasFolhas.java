package views;

import controllers.FolhaPagamentoController;
import models.FolhaPagamento;

public class ListarTodasFolhas {

    public void renderizar(){
        FolhaPagamentoController folhaPagamentoController = new FolhaPagamentoController();
        System.out.println("\n -------- Listagem das Folhas de Pagamento --------\n");
        for (FolhaPagamento folhaPagamentoLista : folhaPagamentoController.listar()) {
            System.out.println(folhaPagamentoLista);
        }
    }
    
}
