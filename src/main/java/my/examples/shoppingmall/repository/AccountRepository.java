package my.examples.shoppingmall.repository;

import my.examples.shoppingmall.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AccountRepository extends JpaRepository<Account, Long>{
    @Query("SELECT A FROM Account A WHERE A.email=:email")
    Account findMyAccount(@Param("email") String email);
}
