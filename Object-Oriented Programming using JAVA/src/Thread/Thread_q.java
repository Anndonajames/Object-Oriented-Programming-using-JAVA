package Thread;

public class Thread_q  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m_Thread r=new m_Thread();
		r.run();
	}

}
class m_Thread extends Thread
{
	public void run()
	{ 	for(int i=1;i<5;i++)
			{
				try
				{
					System.out.println("Thread is going to sleep "+i+" Time" );
					Thread.sleep(10000);
				}
				catch(InterruptedException e)
				{
					System.out.println(e);
				}
				System.out.println("thread is running "+i+ "time");
				System.out.println();
			}
	}	
}