package a_Thread;

public class A_Thread extends Thread { // 2.add extends thread 
	// 1. Write the following code
	public void run() { // 3. change it as green because its a pre defined func in thread
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A_Thread t1 = new A_Thread();
		A_Thread t2 = new A_Thread();
		A_Thread t3 = new A_Thread();
		t1.run();
		t2.run();
		t3.run();
	}

}
