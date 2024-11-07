package in.chaithanya.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import in.chaithanya.entity.Account;
import in.chaithanya.entity.AccountPk;

public interface AccountRepository extends JpaRepository<Account, AccountPk>{

}
