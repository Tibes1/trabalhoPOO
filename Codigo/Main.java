package Codigo;


public class Main {
    public static void main(String[] args) {
        Casa casa[] = new Casa[10];
        Portas porta[] = new Portas[10];
        PortaSala portaSala[] = new PortaSala[10];
        LampadaSala lampadaSala[] = new LampadaSala[10];
        porta[1] = new Portas(1, "Cor", false);
        lampadaSala[1] = new LampadaSala(1, "Cor", false, false);
        portaSala[1] = new PortaSala(1, "Cor", false, false);
        casa[1] = new  Casa("azul", "endereco", porta[1], null);

        System.out.println("----------------------//----------------------");

        portaSala[1].checarEstadoPorta();

        portaSala[1].interagirPorta();

        portaSala[1].checarFuncionamentoPorta();

        portaSala[1].concertarPortaSala();

        portaSala[1].checarFuncionamentoPorta();

        portaSala[1].interagirPorta();

        portaSala[1].checarEstadoPorta();

        System.out.println("----------------------//----------------------");

        porta[1].checarEstadoPorta();

        porta[1].interagirPorta();
        
        porta[1].checarEstadoPorta();
        
        porta[1].interagirPorta();

        porta[1].checarEstadoPorta();

        System.out.println("----------------------//----------------------");

        System.out.println(casa[1].getCor());

        System.out.println(casa[1].getEndereco());

    }
}