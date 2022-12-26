package modelos;

import acciones.Alimentarse;
import acciones.Divertirse;
import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;

import java.time.LocalDateTime;

public class Mascota {
    //Al porner protected, esos atributos se encuentran disponibles no solo para la clase Mascota,
    //sino para cualquier otra clase que herede de ella.
    protected String nombre;
    protected LocalDateTime fechaNacimiento;
    protected LocalDateTime fechaMuerte;
    public boolean isLive; //Ej7
    protected int nivelEnergia;
    protected int nivelHambre;
    protected int nivelCansancio;
    protected int nivelFelicidad;
    protected int nivelAburrimiento;
    protected String propietario;
    //New ej:7
    protected int id;
    protected Alimentarse alimentarse; //Ej7
    protected Divertirse divertirse; //Ej8

    //Metodo CONSTRUCTOR
    public Mascota (String nombre, String propietario){
        setNombre(nombre);
        setPropietario(propietario);
        setLive(true);
        setNivelEnergia(100);
        setNivelHambre((int) (Math.random() * 100));
        setNivelCansancio((int) (Math.random() * 100));
        setNivelFelicidad((int) (Math.random() * 100));
        setNivelAburrimiento((int) (Math.random() * 100));
        setFechaNacimiento(LocalDateTime.now());
        this.alimentarse = new Alimentarse(); //NEW ej7
        this.divertirse = new Divertirse(); //NEW ej7

        /*
        //Sin el uso de los metodos set y get
        this.nombre = nombre;
        this.propietario = propietario;
        this.isLive = true;
        this.nivelEnergia = 100;

        this.nivelHambre = (int) (Math.random() * 100);
        this.nivelCansancio = (int) (Math.random() * 100);
        this.nivelFelicidad = (int) (Math.random() * 100);
        this.nivelAburrimiento = (int) (Math.random() * 100);
        this.fechaNacimiento = LocalDateTime.now();
        */
    }

    //Metodos de la instacia Mascota
    public void comer(AlmacenAlimentos alimento){
        alimentarse.ingerirAlimento(alimento, this);
    };
    public void jugar(EntretenimientosEnum entretenimiento){
        divertirse.entretenerseCon(entretenimiento, this);
    };
    public void dormir(){};



    //-------------------------------------------
    //ENCAPSULAMIENTO (Metodos Getters y Setters)
    //-------------------------------------------
    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public LocalDateTime getFechaNacimiento(){
        return fechaNacimiento;
    }
    public LocalDateTime getFechaMuerte(){
        return fechaMuerte;
    }
    public boolean getIsLive(){
        return isLive;
    }
    public int getNivelEnergia(){
        return nivelEnergia;
    }
    public int getNivelHambre(){
        return nivelHambre;
    }
    public int getNivelCansancio(){
        return nivelCansancio;
    }
    public int getNivelFelicidad(){
        return nivelFelicidad;
    }
    public int getNivelAburrimiento(){
        return nivelAburrimiento;
    }
    public String getPropietario(){
        return propietario;
    }

    // SETTERS
    //Los setters los establecemos en privado, restringimos la posibilidad de que el estado de la
    //mascota pueda ser modificado con posterioridad a la creacion por cualquiera desde
    //cualquier lugar, solo podra modificar su estado la misma clase a traves de estos metodos
    //setters que establecemos en "private".

    private void setNombre (String nombre){
        this.nombre = nombre;
    }
    private void setPropietario(String propietario){
        this.propietario = propietario;
    }
    private void setFechaNacimiento (LocalDateTime fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }
    private void setFechaMuerte (LocalDateTime fechaMuerte){
        this.fechaMuerte = fechaMuerte;
    }
    private void setLive (boolean live){
        this.isLive = live;
    }
    public void setNivelEnergia (int nivelEnergia){
        this.nivelEnergia = nivelEnergia;
        /* Ver que no supere el 100% de la energia // ACA NO VA ME PARECE
        if(nivelEnergia <= 100){
            this.nivelEnergia = nivelEnergia;
        }
        else{
            System.out.println("MENOR" + this.nivelEnergia);
        }
        */


    } //Ej7
    private void setNivelHambre (int nivelHambre){
        this.nivelHambre = nivelHambre;
    }
    private void setNivelCansancio (int nivelCansancio){ this.nivelCansancio = nivelCansancio;}
    private void setNivelFelicidad (int nivelFelicidad){
        this.nivelFelicidad = nivelFelicidad;
    }
    public void setNivelAburrimiento (int nivelAburrimiento){
        this.nivelAburrimiento = nivelAburrimiento;
    } //Ej8



}
