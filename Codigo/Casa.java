package Codigo;

public class Casa { 
    private String cor; 
    private String endereco;
    Codigo.Portas portas;
    Codigo.Lampadas lampadas;


    public Casa(
        String cor,
        String endereco,
        Codigo.Portas portas,
        Codigo.Lampadas lampadas
    ) {
        this.setCor(cor);
        this.setEndereco(endereco);
    }


    public String getCor() {
        return cor;
    }


    public void setCor(String cor) {
        this.cor = cor;
    }


    public String getEndereco() {
        return endereco;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}