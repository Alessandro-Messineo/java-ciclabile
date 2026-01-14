import org.lessons.java.ciclabile.ElencoInteri;

public class App {
    public static void main(String[] args) throws Exception {
        int[] valori = { 1, 2, 3, 4, 5 };

        ElencoInteri elenco = new ElencoInteri(valori);

        elenco.addElemento(6);
        elenco.addElemento(7);
        elenco.addElemento(8);

        while (elenco.hasAncoraElementi()) {
            System.out.println(elenco.getElementoSuccessivo());
        }

        System.out.println("------------------");

        ElencoInteri elenco2 = new ElencoInteri();
        elenco2.addElemento(10);
        elenco2.addElemento(20);
        elenco2.addElemento(30);

        while (elenco2.hasAncoraElementi()) {
            System.out.println(elenco2.getElementoSuccessivo());
        }

    }
}
