package miHexagonal.db_driven_adapter.jparepository;
import org.springframework.data.jpa.repository.JpaRepository;

import miHexagonal.db_driven_adapter.domain.BookEntity;
import miHexagonal.db_driven_adapter.jparepository.*;

public interface HAAJpaRepository extends  JpaRepository <BookEntity, Long>{}