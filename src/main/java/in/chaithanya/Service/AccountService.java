package in.chaithanya.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import in.chaithanya.entity.Account;
import in.chaithanya.entity.AccountPk;
import in.chaithanya.repos.AccountRepository;

@Service
public class AccountService {
	
	private AccountRepository accRepo;
	
	public AccountService(AccountRepository accRepo) {
		this.accRepo=accRepo;
	}

	public void getDataUsingPk() {
		AccountPk pk=new AccountPk();
		pk.setAccId(100);
		pk.setAccType("current");
		pk.setHolderName("Vsoft");
		
		Optional<Account> findById=accRepo.findById(pk);
		if(findById.isPresent()) {
			System.out.println(findById.get());
		
		}
	}
		public void saveData() {
			
			AccountPk pk=new AccountPk();
			pk.setAccId(120);
			pk.setAccType("saving");
			pk.setHolderName("IBM");
			
			Account a=new Account();
			a.setBranchName("Macherla");
			a.setMinBal(5000.00);
			a.setAccPk(pk); //setting pk class obj to entity obj
			
			accRepo.save(a);
			
		
		
	}
}
