package atividade4;

import java.util.List;

public class PetShop {

    private static List<Servico> servicos = 
        List.of(
                new ServicoTosa(),
                new ServicoBanho(),
                new ServicoConsultaVeterinario(),
                new ServicoVacina()
        );
        
    public static void main(String[] args) {

        System.out.println("Serviços e tabelas de preços: ");
        for (Servico servico : servicos) {
            System.out.println(servico.retornaLinhaCusto());
        }
    }
}