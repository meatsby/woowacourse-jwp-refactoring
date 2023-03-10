package kitchenpos.domain.table;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderTableRepository extends JpaRepository<OrderTable, Long> {

    List<OrderTable> findAllByTableGroupId(final Long tableGroupId);
}
