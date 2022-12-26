package modelos;

public class DukeMascota extends Mascota {

    //Metodo constructor de la clase hija. Ojo no olvidarse del poner SUPER...
    public DukeMascota(String nombre, String propietario){
        super(nombre, propietario);
    }

    @Override
    public String toString() {
        return "La mascota de nombre: " + nombre + '\n' +
                "nacio el dia: "    + fechaNacimiento.getDayOfWeek() + ", "
                                    + fechaNacimiento.getDayOfMonth() + " de "
                                    + fechaNacimiento.getDayOfMonth() + " del año "
                                    + fechaNacimiento.getYear() + '\n'
                + "a la hora: "     + fechaNacimiento.getHour() + ":"
                                    + fechaNacimiento.getMinute() + '\n'
                + "Actualmente se encuentra " + ((isLive) ? "vivo\n" : "muerto\n")
                + "Su nivel de Energia se encuentra en: " + nivelEnergia + "%\n"
                + "el nivel de Hambre en: " + nivelHambre + '\n'
                + "el nivel de Cansancio: " + nivelCansancio + '\n'
                + "el nivel de Felicidad: " + nivelFelicidad + '\n'
                + "el nivel de Aburrimiento: " + nivelAburrimiento + '\n'
                + "y su actual propietario es: " + propietario + '\n';

    }
}
