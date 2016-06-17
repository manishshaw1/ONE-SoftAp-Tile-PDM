import java.io.*;
import java.util.*;
class Run
{
	public static void main(String args[])throws IOException
	{
		Scanner in = new Scanner(System.in);
		System.out.println("0 36000 0 800 0 600");
		System.out.println("0 0 800 600");
		System.out.println("0 1 1500 1500");
		int c=0;
		for(int i=0;i<=150;i++)
		{
			if(i%2==0){
				c = first(c);
			}
			else{
				c = second(c);
			}
		}
	}
	public static int first(int time){
		int wait_time = 240;
		int nloc1 = 800;
		int nloc2 = 600;
		System.out.println(time + " 2 " + nloc1 + " " + nloc2);
		time = time + wait_time;
		System.out.println(time + " 2 " + nloc1 + " " + nloc2);
		return time;
	}
	public static int second(int time){
		int wait_time = 480;
		int nloc1 = 1500;
		int nloc2 = 1500;
		System.out.println(time + " 2 " + nloc1 + " " + nloc2);
		time = time + wait_time;
		System.out.println(time + " 2 " + nloc1 + " " + nloc2);
		return time;
	}
}