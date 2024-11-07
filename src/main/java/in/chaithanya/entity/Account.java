package in.chaithanya.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="BANK_ACCOUNTS")
public class Account {
	
	@Column(name="BRANCH_NAME")
	private String branchName;
	
	@Column(name="MIN_BAL")
	private Double minBal;
	
	@EmbeddedId
	private AccountPk accPk;

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public Double getMinBal() {
		return minBal;
	}

	public void setMinBal(Double minBal) {
		this.minBal = minBal;
	}

	public AccountPk getAccPk() {
		return accPk;
	}

	public void setAccPk(AccountPk accPk) {
		this.accPk = accPk;
	}

	
}
