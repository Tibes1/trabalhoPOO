package Codigo;

public class Lampadas {
    private int Peso;
    private String Cor;
    public boolean EstadoLampada; //estado "true" =  ligado, "false" = desligado
    public Codigo.LampadaSala LampadaSala;

    public Lampadas (
        int Peso,
        String Cor,
        boolean EstadoLampada
    ) {
        this.setPeso(Peso);
        this.setCor(Cor);
        this.EstadoLampada = EstadoLampada;
    }

    public int getPeso() {
        return Peso;
    }

    public void setPeso(int peso) {
        this.Peso = peso;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        this.Cor = cor;
    }

    public void interagirLampada() {
        if (EstadoLampada = false) {
            setEstadoLampada(true);
        } else {
            setEstadoLampada(false);
        }
    }

    public boolean getEstadoLampada() {
        return EstadoLampada;
    }

    public void setEstadoLampada(boolean EstadoDesejado) {
        EstadoLampada = EstadoDesejado;
    }

    public void checarEstadoLampada() {
        if (EstadoLampada = false) {
            System.out.println("esta lampada esta apagada");
        } else {
            System.out.println("esta lampada esta acesa");
        }
    }
}
