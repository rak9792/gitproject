import java.io.*;

public class Main
{
	public static void main(String arg[]) throws IOException
	{
		int TC=0;
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));	
		TC=Integer.parseInt(br.readLine());
		int arr[];
		L:while(TC>0)
		{
			int N=Integer.parseInt(br.readLine());
			arr=new int[N+1];
			int i=1,k=2;
			while(arr[N]!=(-1))
			{
				while(i<=N)
				{
					arr[i]=i;
					i=i+k;
				}
				i=1;
				if(arr[N]==0)
					arr[N]=(-1);
				k++;
			}
			if(arr[N]==(-1))
				System.out.println("unlucky");
			else
				System.out.println("lucky");
			TC--;
		}
	}
	
}
