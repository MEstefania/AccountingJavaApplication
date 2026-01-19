package org.sofkajavaclients.repository;

import org.sofkajavaclients.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
        Optional<Cliente> findByIdentificacion(final String identificacion);
}
