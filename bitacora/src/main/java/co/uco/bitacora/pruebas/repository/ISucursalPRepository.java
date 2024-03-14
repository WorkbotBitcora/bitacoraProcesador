package co.uco.bitacora.pruebas.repository;

import co.uco.bitacora.pruebas.domain.sucursal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISucursalPRepository extends JpaRepository<sucursal,Long> {
}