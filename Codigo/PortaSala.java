package Codigo;

public class PortaSala extends Portas {
    public boolean funcionamento; // funcionamento "true" = operante, "false" = inoperante
    
    public PortaSala( int Peso, String Cor, Boolean funcionamento, boolean EstadoPorta) {
        super(Peso, Cor, EstadoPorta);
        //TODO Auto-generated constructor stub
        this.funcionamento = funcionamento;
    }

    public boolean getFuncionamento() {
        return funcionamento;
    }

    public void setFuncionamento(boolean funcionamento) {
        this.funcionamento = funcionamento;
    }

    public void concertarPortaSala() {
        if (funcionamento == false) {
            setFuncionamento(true);
            System.out.println("a porta da sala foi concertada");
        }
    }

    @Override
    public void interagirPorta() {
        if (funcionamento == true) {
            if (EstadoPorta == false) {
                setEstadoPorta(true);
            } else {
                setEstadoPorta(false);
            }
        } else {
            System.out.println("AVISO: impossivel interagir, a porta da sala esta inoperante");
        }
    }

    public void checarFuncionamentoPorta (){
        if (funcionamento == false) {
            System.out.println("a porta da sala esta inoperante");
        } else {
            System.out.println("a porta da sala esta operante");
        }
    }

}
