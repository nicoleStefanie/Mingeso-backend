package MingesoTingeso.demo.Repositories;

import MingesoTingeso.demo.Models.Habitacion;
import MingesoTingeso.demo.Models.Registro;
import MingesoTingeso.demo.Models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
    Registro findRegistroByIdRegistro(Long idRegistro);

    List<Registro> findRegistroByRepresentante(String representante);

    List<Registro> findRegistroByHabitacion(Habitacion habitacion);

    List<Registro> findAll();

    List<Registro> findByUsuario(Usuario usuario);

    List<Registro> findByFechaTerminoGreaterThan(Date fechaTermino);

    List<Registro> findByHabitacionAndFechaTerminoGreaterThan(Habitacion habitacion, Date fechaTermino);
}
