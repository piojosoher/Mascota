import enumeradores.AlmacenAlimentos;
import enumeradores.EntretenimientosEnum;
import modelos.DukeMascota;
import modelos.Mascota;
import persistencia.persistenceCollections.IMascotaPersistenceUseList;

public class Main {

    public static void main(String[] args) {

        IMascotaPersistenceUseList persistence = new IMascotaPersistenceUseList();

        DukeMascota duke = new DukeMascota("Mario", "Hernan");
        DukeMascota duke2 = new DukeMascota("Luigi", "Hernan");
        DukeMascota duke3 = new DukeMascota("Bowser", "Hernan");
        DukeMascota duke4 = new DukeMascota("Peach", "Hernan");

        persistence.guardar(duke);
        persistence.guardar(duke2);
        persistence.guardar(duke3);
        persistence.guardar(duke4);

        /*
        for(Mascota mascota : persistence.getAllMascotas()){
            System.out.println(mascota);
        }
        */

        System.out.println("Antes de comer: " + duke.getNivelEnergia());
        duke.comer(AlmacenAlimentos.ASADO);
        System.out.println("Despues de comer: "+ duke.getNivelEnergia());

        duke.jugar(EntretenimientosEnum.TRUCO);
        System.out.println(duke.getNivelAburrimiento());

        /*
        System.out.println(duke.getNombre());
        System.out.println(duke.getPropietario());
        System.out.println(duke.getFechaNacimiento());
        System.out.println(duke.getNivelEnergia());
        System.out.println(duke.getNivelHambre());
        System.out.println(duke.getNivelFelicidad());
        System.out.println(duke.getNivelAburrimiento());
        System.out.println(duke.getNivelCansancio());
        */
        //Forma simplificada:
        //System.out.println(duke);
    }
}
