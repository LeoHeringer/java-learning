public class Celular {

    String marca;
    String modelo;
    int bateria;
    boolean ligado;

    public Celular(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = 100;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("Celular ligado");
        } else {
            System.out.println("Já está ligado");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Celular desligado");
        } else {
            System.out.println("Já está desligado");
        }
    }

    public void usar(int consumo) {
        if (ligado && bateria > 0) {
            bateria -= consumo;
            if (bateria < 0) bateria = 0;
            System.out.println("Usando celular... bateria: " + bateria + "%");
        } else {
            System.out.println("Não pode usar");
        }
    }

    public void carregar() {
        bateria = 100;
        System.out.println("Celular carregado");
    }
}