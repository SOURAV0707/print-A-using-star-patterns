class Eee
{
public static void main(String args[])
{
int n=5;
int a=n;
int b=n;
for(int i=1;i<=5;i++)
{
for(int j=1;j<10;j++)
{
if(j==a||j==b||i==n/2+1 && j==5)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
a++;
b--;
System.out.println();
}
System.out.println();
}
}