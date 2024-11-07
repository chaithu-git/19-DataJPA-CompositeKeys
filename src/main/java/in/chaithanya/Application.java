package in.chaithanya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.chaithanya.Service.AccountService;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(Application.class, args);
		AccountService accountService=context.getBean(AccountService.class);
		//accountService.saveData();
		accountService.getDataUsingPk();
		
		context.close();
		
	}

}
