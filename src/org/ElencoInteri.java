package org;

public class ElencoInteri {

    private int[] numeri;
    private int indice = 0;

    public ElencoInteri(int[] array) {
        numeri = array;
    }

    public ElencoInteri() {
        numeri = new int[0];

    }

    public void addElemento(int nuovoElemento) {

        int[] nuovoArray = new int[numeri.length + 1];

        for (int i = 0; i < numeri.length; i++) {
            nuovoArray[i] = numeri[i];
        }
        nuovoArray[nuovoArray.length - 1] = nuovoElemento;
        numeri = nuovoArray;
    }

    public int getElementoSuccessivo() {

        int num;
        num = numeri[indice];
        indice++;
        return num;

    }

    public boolean hasAncoraElementi() {

        return indice < numeri.length;

    }

}
