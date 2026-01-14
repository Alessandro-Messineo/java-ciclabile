package org;

public class ElencoInteri {

    private int[] numeri;
    private int indice = 0;


    public ElencoInteri(int[] array){
        numeri = array;
    }


    public int getElementoSuccessivo(){

        int num;
        num = numeri[indice];
        indice++;
        return num;

    }

    public boolean hasAncoraElementi(){

        return indice < numeri.length; 

    }

}
