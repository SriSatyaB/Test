package interfaceDemo;

public class TestBank {
	public static void main(String[] args) {
		Bank b=new Bank();
		b.BusinessLoan();
		b.credit();
		b.debit();
		b.deposit();
		b.insurance();
		b.Homeloan();
		
		//because minBalance is static variable.we can call by class name
		System.out.println(RBIBank.minBalance);
		
		//we can create reference variable for interface
		
		//rbi is reference variable of Bank class object
		RBIBank rbi=new Bank();
		rbi.credit();
		InternationalBank in = new Bank();
		in.BusinessLoan();
	}

}
