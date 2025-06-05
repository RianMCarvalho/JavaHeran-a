package Produtos;

public class Celular extends Produto {
    private String marca;
    private String modelo;
    private int armazenamentoGB;
    private String sistemaOperacional;

    public Celular(String nome, double preco, String marca, String modelo, int armazenamentoGB, String sistemaOperacional) {
        super(nome, preco);
        this.marca = marca;
        this.modelo = modelo;
        this.armazenamentoGB = armazenamentoGB;
        this.sistemaOperacional = sistemaOperacional;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getArmazenamentoGB() {
        return armazenamentoGB;
    }

    public void setArmazenamentoGB(int armazenamentoGB) {
        this.armazenamentoGB = armazenamentoGB;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Armazenamento: " + this.armazenamentoGB + "GB");
        System.out.println("Sistema Operacional: " + this.sistemaOperacional);
    }
}