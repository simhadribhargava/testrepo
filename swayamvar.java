import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String a=s.next();
        String b=s.next();
        String p[]=a.split("");
        String q[]=b.split("");
        List<String> x=new ArrayList<String>(Arrays.asList(p));
        List<String> y=new ArrayList<String>(Arrays.asList(q));
        int z=0;
        int i=0;
        int count=x.size()+y.size();
        int check=y.size();
        int sum=0,flag=0;
        while(check!=0)
        {
            if(x.get(z).equals(y.get(i)))
            {
                x.remove(z);
                y.remove(i);
                count=count-2;
                check=check-1;
                flag=1;
            }
            else
            {
                String c=y.get(i);
                y.remove(i);
                y.add(c);
                if(flag==1)
                {
                    sum=1;
                    flag=0;
                }
                else
                {
                    sum=sum+1;
                }
                if(sum==y.size())
                {
                    check=0;
                }
            }
        }
        System.out.println(count/2);
    }
}