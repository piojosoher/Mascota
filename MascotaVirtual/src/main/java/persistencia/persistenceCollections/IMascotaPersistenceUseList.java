package persistencia.persistenceCollections;

/*IMPLEMENTAR los metodos que se encuentran solo definidos por su firma en una INTERFAZ,
 esta palabra es ' implements '*/
import modelos.Mascota;
import persistencia.IMascotaPersistence;

import java.util.List;

public class IMascotaPersistenceUseList implements IMascotaPersistence {

    @Override
    public void guardar(Mascota mascota) {
        bdMascotas.add(mascota);
    }

    @Override
    public Mascota getMascota(int id) {
        return bdMascotas.get(id);
    }

    @Override
    public Mascota getMascota(String nombre) {
        for(Mascota elemento:bdMascotas) {
            if (elemento.getNombre().equals(nombre)) {
                return elemento;
            }
        }
        return null;
    }

    @Override
    public List<Mascota> getAllMascotas() {
        return bdMascotas;
    }

    @Override
    public void updateMascota(int id, Mascota mascota) {
        bdMascotas.set(id, mascota);
    }

    @Override
    public void deleteMascota(int id) {
        bdMascotas.remove(getMascota(id));
    }
}