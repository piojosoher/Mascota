package enumeradores;

public enum EntretenimientosEnum {
    LUDO(15), POKER(25), TRUCO(30), FUTBOL(45), DAMAS(10), TEJO(20);

    private  int desaburrimiento;

    EntretenimientosEnum(int desaburrimiento){
        this.desaburrimiento = desaburrimiento;
    }

    public int getDesaburrimiento(){
        return this.desaburrimiento;
    }

}
