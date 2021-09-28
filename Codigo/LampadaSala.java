package Codigo;

public class LampadaSala extends Lampadas {
    public boolean funcionamento; // funcionamento "true" = operante, "false" = inoperante
    
    public LampadaSala( int Peso, String Cor, Boolean funcionamento, boolean EstadoLampada) {
        super(Peso, Cor, EstadoLampada);
        //TODO Auto-generated constructor stub
        this.funcionamento = funcionamento;
    }

    public boolean getFuncionamento() {
        return funcionamento;
    }

    public void setFuncionamento(boolean funcionamento) {
        this.funcionamento = funcionamento;
    }

    public void concertarLampadaSala() {
        if (funcionamento = false) {
            setFuncionamento(true);
            System.out.println("a lampada da sala foi concertada");
        }
    }

    @Override
    public void interagirLampada() {
        if (funcionamento = true) {
            {
                if  (EstadoLampada = false) {
                    setEstadoLampada(true);
                } else {
                    setEstadoLampada(false);
                }
            } 

        }
    }

    public void checarFuncionamentoLampada (){
        if (funcionamento == false) {
            System.out.println("a lampada da sala esta inoperante");
        } else {
            System.out.println("a lampada da sala esta operante");
        }
    }
}
