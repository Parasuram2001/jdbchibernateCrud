
class SharedResource1 {
	public void res1()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
	public void res2()
	{
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class sample33 extends Thread{
	SharedResource1 sr;
	sample33(SharedResource1 sr)
	{
		this.sr = sr;
	}
	public void run3()
	{
		sr.res1();
	}
}
class Demo extends Thread{
	SharedResource1 sr;
	Demo(SharedResource1 sr)
	{
		this.sr = sr;
	}
	public void run4()
	{
		sr.res2();
	}
}
public class SharedResource{
	public static void main(String[] args) {
		SharedResource1 sr = new SharedResource1();
		sample33 s = new sample33(sr);
		Thread th = new Thread(s);
		th.start();
		
		Demo d = new Demo(sr);
		Thread th1 = new Thread(d);
		th1.start();
	}
}


