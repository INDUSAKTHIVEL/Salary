package Weeklysalary;
import java.util.*;
//a=Hourlyrate,b=Dailylimit,c=Weeklylimit
public class Salary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int [] hrswrk = new int[7];
		for (int i=0;i<7;i++)
		{
			hrswrk[i] = sc.nextInt();
		}
		int a = 100;
		int b = 8;
		int c = 40;
		int Salary = 0;
		for(int i=0;i<7;i++)
		{
			int dailysalary = hrswrk[i]*a;
			if (hrswrk[i]>b)
			{
				int extrahrs = hrswrk[i]-b;
				dailysalary +=extrahrs*15;
			}
			Salary +=dailysalary;
		}
		int tothr=caltothrs(hrswrk);
		if (tothr>c)
		{
			int extrahr=tothr-c;
			Salary += extrahr*25;
		}
		Salary += calweekbonus(hrswrk);
		System.out.println(Salary);
		
	}

	private static int calweekbonus(int[] hrswrk) {
		int sh=hrswrk[6];
		int shr=hrswrk[6];
		int weekbounce =0;
		weekbounce+=sh*0.25*100;
		weekbounce+=shr*0.5*100;
		return 0;
	}

	private static int caltothrs(int[] hrswrk) 
	{
		int tothrs=0;
		for(int k=0;k<7;k++)
		{
			tothrs +=hrswrk[k];
			
		}
		return 0;
	}
}

