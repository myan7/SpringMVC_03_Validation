package my.spring.pojos;

public class Account {
	private Integer accountNo;
	private String accountHolderName;
	private Integer accountBalance;

	public Account() {

	}

	public Account(Integer accountNo, String accountHolderName, Integer accountBalance) {
		super();
		this.accountNo = accountNo;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}

	public Integer getAccountBalance() {
		return accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public Integer getAccountNo() {
		return accountNo;
	}

	public void setAccountBalance(Integer accountBalance) {
		this.accountBalance = accountBalance;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setAccountNo(Integer accountNo) {
		this.accountNo = accountNo;
	}

}
