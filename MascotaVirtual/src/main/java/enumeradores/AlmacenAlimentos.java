package enumeradores;

public enum AlmacenAlimentos {

    SOPA(15), ASADO(25), CHORIPAN(10), ENSALADA(20), MILANESA(5);

    /* Metodo contructor: Como el metodo por dafaul no espera recibir ningun parametro, creamos uno para pasarle un valor*/
    private int energiaAportada;

    AlmacenAlimentos(int energia){
        this.energiaAportada = energia;
    }

    //Getter para obtener desde cualquier lado el valor de energiaAportada
    public int getEnergiaAportada(){
        return energiaAportada;
    }

}
