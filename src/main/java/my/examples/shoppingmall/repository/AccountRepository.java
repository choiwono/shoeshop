package my.examples.shoppingmall.repository;

import my.examples.shoppingmall.domain.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    @Query("SELECT A FROM Account A WHERE A.id=:id")
    Optional<Account> findMyOrders(@Param("id") Long id);
}