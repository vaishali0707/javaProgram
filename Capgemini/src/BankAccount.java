
class BankAccount
 {
	private int accountNumber;
	String accountHolderName;
	private float totalBalance;
	int depositAmount;
    int withdrawAmount;
    float updatedBalance;
	void setAccountNumber(int accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	int getAccountNumber()
	{
		return accountNumber;
	}
	void setAccountHolderName(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	String getAccountHolderName()
	{
		return accountHolderName;
	}
	void setBalance(float totalBalance)
	{
		this.totalBalance=totalBalance;
	}
	float getBalance()
	{
		return totalBalance;
	}
	void setCashDeposit(int depositAmount)
	{
		this.depositAmount=depositAmount;
	}
	int getCashDeposit()
	{
		return depositAmount;
	}
	float balanceAfterDeposit()
	{
      updatedBalance=totalBalance+depositAmount;
      return updatedBalance;
	}
	void setCashWithdraw(int withdrawAmount)
	{
		this.withdrawAmount=withdrawAmount;
	}
	int getCashWithdraw()
	{
		return withdrawAmount;
	}
	float balanceAfterWithdraw()
	{
        updatedBalance=totalBalance-withdrawAmount;
        return updatedBalance;
    }
}
	

    class AccountDetails
    {
        public static void main(String[] args)
     {
		BankAccount b=new BankAccount();
		b.setAccountNumber(1234);
		b.setAccountHolderName("Vaishali");
		b.setBalance(30000);
		System.out.println("Account number is "+b.getAccountNumber());
		System.out.println("Account Holder Name is "+b.getAccountHolderName());
        System.out.println("Total Balance is "+b.getBalance());
        b.setCashDeposit(2000);
        b.getCashDeposit();
        System.out.println("The amount after deposit is "+ b.balanceAfterDeposit());
        b.setCashWithdraw(1000);
        b.getCashWithdraw();
        System.out.println("The amount after withdraw is "+ b.balanceAfterWithdraw());
	 }
    }


