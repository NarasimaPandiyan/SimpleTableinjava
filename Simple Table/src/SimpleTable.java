import java.util.Scanner;
public class SimpleTable {
	public static int max(String a[])
	{
		int len = 0,max = 0,i,n=a.length;
		for(i=0;i<n;i++)
		{
			len=a[i].length();
			if(max<len)
				max=len;
		}
		return max;
		
	}
	
	@SuppressWarnings("resource")
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the n");
		int n = in.nextInt();
		String name[] = new String[n+1];
		String Rollnumber[] = new String[n+1];
		String number[] = new String[n+1];
		name[n] = "Name";
		Rollnumber[n]= "Roll Number";
		number[n]="Number";
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of student "+i);
			name[i]=in.nextLine();
			System.out.println("Enter the Rollnumber of student "+i);
			Rollnumber[i]=in.nextLine();
			System.out.println("Enter the number of student "+i);
			number[i]=in.nextLine();
		}
		int maxarray[] = new int[3];
		maxarray[0]=max(name);
		maxarray[1]=max(Rollnumber);
		maxarray[2]=max(number);
		String[] title = {"Name","Roll Number","Number"};
		System.out.print("+-");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<maxarray[i];j++)
			{
				System.out.print("-");
			}
			System.out.print("-+");
		}
		System.out.println();
		int space=0,len=0;
		System.out.print("| ");
		for(int i=0;i<3;i++)
		{
			System.out.print(title[i]);
			len=title[i].length();
			space=maxarray[i]-len;
			for(int j=0;j<space;j++)
				System.out.print(" ");
			System.out.print(" |");
		}
		System.out.println();
		System.out.print("+-");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<maxarray[i];j++)
			{
				System.out.print("-");
			}
			System.out.print("-+");
		}
		System.out.println();
		
		for(int h=0;h<n;h++) {
			System.out.print("| ");
		for(int i=0;i<3;i++)
		{
			switch(i)
			{
			case 0:
			{
				System.out.print(name[h]);
				len=name[h].length();
				break;
			}
			case 1:
			{
				System.out.print(Rollnumber[h]);
				len=Rollnumber[h].length();;
				break;
			}
			case 2:
			{
				System.out.print(number[h]);
				len=number[h].length();;
				break;
			}
			}
			space=maxarray[i]-len;
			for(int j=0;j<space;j++)
				System.out.print(" ");
			System.out.print(" |");
		}
		System.out.println();
		}
		System.out.print("+-");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<maxarray[i];j++)
			{
				System.out.print("-");
			}
			System.out.print("-+");
		}
		System.out.println();
		/**System.out.println("name :"+mn);
		System.out.println("Roll number :"+mrn);
		System.out.println("number :"+mnum);*/
	}

}
