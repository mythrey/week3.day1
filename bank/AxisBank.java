package org.bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Deposited money under class AxisBank");
	}

	public static void main(String[] args) {
		AxisBank ab = new AxisBank();
		// inherited from own class
		ab.deposit();
		// inherited from class BankInfo
		ab.saving();
		ab.deposit();
		ab.fixed();

	}
}
