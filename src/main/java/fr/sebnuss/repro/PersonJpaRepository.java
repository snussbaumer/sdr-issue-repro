package fr.sebnuss.repro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author snussbaumer
 */
@RepositoryRestResource
public interface PersonJpaRepository extends JpaRepository<Person, Integer> {
}
