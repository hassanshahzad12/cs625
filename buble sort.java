public class bubblesort {
public static void main(String[] args) {
int num[]={25,45,32,10,5,80,76,44,30,25};
int a,b,i,temp;
int size=10;
for(i=0; i<10; i++)
System.out.println("the original arrays=" + num[i]);
for(a=1; i<10; i++)
for(b=size-1; b>=a; b--)
{
if (num[b-1]>num[b])
{
temp=num[b-1];
num[b-1]=num[b];
num[b]=temp;
}
}
for(i=0; i<size; i++)
System.out.println("the array is sorted form=" + num[i]);
}
}