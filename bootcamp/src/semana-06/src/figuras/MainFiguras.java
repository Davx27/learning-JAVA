package figuras;

public class MainFiguras {
    public static void main(String[] args) {

        Figura c = new Circulo(5);
        Figura r = new Rectangulo(4, 6);
        Figura t = new Triangulo(3, 4, 5);

        c.mostrarInfo();
        r.mostrarInfo();
        t.mostrarInfo();
    }
}
