package OrientacaoObjetos.OrientacaoObjeto_aula27;

public class testes {

}

class testesCarro {

    public static void main(String[] args) {

        Carro polo = new Carro();
        polo.marca = "Volkswagen";
        polo.modelo = "Passeio";
        polo.numPassageiros = 5;
        polo.capCombustivel = 100;
        polo.consumoCombustivel = 0.2;

        System.out.println(polo.marca);
        System.out.println(polo.modelo);

        polo.exibirAutonomia();
        
        double autonomia = polo.obterAutonomia();
        
        System.out.println("A autonomia do carro é: " + autonomia);

    
        double qtdCombustivel10 = polo.calcularCombustivel(10);
        double qtdCombustivel15 = polo.calcularCombustivel(15);
        
        System.out.println("Qtd combustivel 10 = " + qtdCombustivel10);
        System.out.println("Qtd combustivel 15 = " + qtdCombustivel15);
    }
}
