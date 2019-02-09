package my.examples.shoppingmall.repository;

import my.examples.shoppingmall.domain.OrderProduct;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderProductRepository extends JpaRepository<OrderProduct,Long> {
    @Query("SELECT O FROM OrderProduct O WHERE O.account.id=:id")
    public Page<OrderProduct> findAllMyOrderList(@Param("id") Long id, Pageable pageable);
}
