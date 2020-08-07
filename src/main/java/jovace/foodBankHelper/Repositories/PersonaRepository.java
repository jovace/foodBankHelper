package jovace.foodBankHelper.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import jovace.foodBankHelper.Entities.PersonaEntity;

public interface PersonaRepository extends CrudRepository<PersonaEntity, Long> {
	
	List<PersonaEntity> findByIdentificacion(String identificacion);
	
	Optional<PersonaEntity> findById(Long id);

}
