import java.util.Scanner;
public class Matrix_Addition
{
public static void main(String []str)
{
Scanner input=new Scanner(System.in);
System.out.print("Enter the size of the rows:");
int m=input.nextInt();
System.out.print("Enter the size of the columns:");
int n=input.nextInt();
int a[][]=new int[m][n];
System.out.println("Enter the element of the first matrix");
for(int i=0; i<a.length; i++)
for(int j=0; j<a[0].length;j++)
a[i][j]=input.nextInt();
int b[][]=new int[m][n];
System.out.println("Enter the element of the second matrix");
for(int i=0; i<b.length; i++)
for(int j=0; j<b[0].length;j++)
b[i][j]=input.nextInt();
a=addMatrixes(a,b); // Method Call
System.out.println("\nThe addition of them:");
for(int i=0; i<a.length; i++)
{
for(int j=0; j<a[0].length; j++)
System.out.print(a[i][j]+" ");
System.out.println();
}
}
public static int[][] addMatrixes(int a[][], int b[][])
{
for(int i=0; i<a.length; i++)
for(int j=0; j<a[0].length; j++)
a[i][j]=a[i][j]+ b[i][j];
return a;
}//end the addMatrixes method
}
