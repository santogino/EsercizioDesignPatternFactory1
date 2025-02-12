public class Main {
    public static void main(String[] args) {
        Shape quadrato = new Quadrato();
        Shape triangolo = new Triangolo();
        Shape rettangolo = new Rettangolo();

        quadrato.draw();
        triangolo.draw();
        rettangolo.draw();
    }
}