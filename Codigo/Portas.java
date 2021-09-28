package Codigo;

public class Portas {
    private int Peso;
    private String Cor;
    public boolean EstadoPorta;
    public Codigo.PortaSala portaSala;

    public Portas (
        int Peso,
        String Cor,
        boolean EstadoPorta
    ) {
        this.setPeso(Peso);
        this.setCor(Cor);
        this.EstadoPorta = EstadoPorta;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        this.Peso = peso;
    }

    public void interagirPorta() {
        if (EstadoPorta == false) {
            setEstadoPorta(true);
        } else {
            setEstadoPorta(false);
        }
    }

    public boolean getEstadoPorta() {
        return EstadoPorta;
    }

    public void setEstadoPorta(boolean EstadoDesejado) {
        EstadoPorta = EstadoDesejado;
    }

    public void checarEstadoPorta() {
        if (EstadoPorta == false) {
            System.out.println("esta porta esta fechada");
        } else {
            System.out.println("esta porta esta aberta");
        }
    }
}
