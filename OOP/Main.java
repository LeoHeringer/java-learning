public class Main {
    public static void main(String[] args) {

        Celular celular1 = new Celular("Samsung", "Galaxy S21");

        celular1.ligar();
        celular1.usar(30);
        celular1.usar(50);
        celular1.carregar();
        celular1.desligar();
    }
}