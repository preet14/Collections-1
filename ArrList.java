import java.util.*;
class Test12
{
    private int arr[];
    private int size;
    private int index;
    private int osize;
    Test12(int size)
    {
        this.size = size;
        arr = new int[this.size];
        index = -1;
        this.osize=size;
    }
    
    public void add(int data)
    {
        if(index==size-1)
        {
            this.size=size+(size*(3/2));
            //System.out.println(this.size);
            int temp[]=arr;
            arr=new int[size];
            for(int i=0;i<=index;i++)
            {
                arr[i]=temp[i];
            }
            index++;
            arr[index]=data;
        }
        else{
        index++;
        arr[index]=data;
        }
    }
    public void delete(int pos) //deletion by just passing position of element to be deleted
    {
        if(pos<=index)
        {
        for(int i=pos;i<=index;i++)
        {
            arr[i]=arr[i+1];
        }
        index--;
        }
        else
        {
            System.out.println("index not exists");
        }
    }
    public void deleteAll()
    { 
        if(index != -1)
        {
         index=-1;
         arr = new int[this.osize];
        }
        else
        {
          System.out.println("Array List is empty");
        }
    }
    public int get(int pos)
    {
        if(pos<=index)
        {
            return arr[pos];
        }
       return 0; 
    }
    public void reverse()
    {
        int start=0;
        int end=index;
        while(start<=end)
        {
            int t=arr[start];
            arr[start]=arr[end];
            arr[end]=t;
            start++;
            end--;
        }
    }
    public void print()
    {
        if(index<0)
        {
            System.out.println("Nothing to print..");
        }
        else{
        for(int i=0;i<=index;i++)
        {
            System.out.println(arr[i]);
        }
        }
    }
}
public class ArrList
{
  public static void main(String args[])
  {
      int y;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Test12 obj = new Test12(n);
      
      for(int i=0;i<n;i++)
      {
          int x = sc.nextInt();
          obj.add(x);
      }
      System.out.println("Enter :  ");
      y=sc.nextInt();
      obj.add(y);
      obj.print();
      System.out.println("Enter to delete :  ");
      y=sc.nextInt();
      obj.delete(y); //delete by postion of ArrayList
      System.out.println("After delete : ");
      obj.print();
      System.out.println("After reverse : ");
      
      //obj.reverse();
      //obj.print();
      //  obj.deleteAll(); use this to delete all elements of ArrayList
  }
}
