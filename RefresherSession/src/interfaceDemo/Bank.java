package interfaceDemo;

public class Bank implements RBIBank, InternationalBank{
//InternationalBank interface
	@Override
	public void Homeloan() {
		// TODO Auto-generated method stub
		System.out.println("bank - home loan");
	}

	@Override
	public void BusinessLoan() {
		// TODO Auto-generated method stub
		System.out.println("bank - business loan");
	}
//RBIBank interface
	@Override
	public void credit() {
		// TODO Auto-generated method stub
		System.out.println("bank -credit");
	}

	@Override
	public void debit() {
		// TODO Auto-generated method stub
		System.out.println("bank - debit");
	}
	
//bank methods
	
	public void deposit() {
		System.out.println("bank - deposit");
	}
	
	public void insurance() {
		System.out.println("bank - insurance");
	}
}
