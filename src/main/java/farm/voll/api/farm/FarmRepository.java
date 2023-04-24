package farm.voll.api.farm;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmRepository extends JpaRepository<Farm, Long> {

    Page<Farm> findAllByAtivoTrue(Pageable paginacao);
}
