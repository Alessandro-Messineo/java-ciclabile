import org.ElencoInteri;

public class App {
    public static void main(String[] args) throws Exception {
        int[] valori = {1,2,3,4,5};

        ElencoInteri elenco = new ElencoInteri(valori);

        while(elenco.hasAncoraElementi()){
            System.out.println(elenco.getElementoSuccessivo()); 
        }

    }
}
