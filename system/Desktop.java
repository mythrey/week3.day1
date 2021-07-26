package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("I am desktop size under Class Desktop");
	}

	public static void main(String[] args) {
		Desktop dt = new Desktop();
		dt.desktopSize();
        dt.computermodel();
	}

}
