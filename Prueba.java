public class Prueba {
    public static void main(String[] args) {
        Contador c = new Contador();
        Contador z = new Contador();
        c.setValor(4);
        z.setValor(5);

        System.out.println(c.getValor());
        System.out.println(z.getValor());
        System.out.println(c.equals(z));
    }
}