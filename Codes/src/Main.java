import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s="aaabdddde";
        int ar[]=new int[2];

        int p1=0,maxlen=Integer.MIN_VALUE;

        int count=1;
        for(int p2=p1+1;p2<s.length();p2++)
        {
            if (s.charAt(p1)==s.charAt(p2) && p2==s.length()-1)
            {

                if(count>=maxlen)
                {
                    maxlen=count;
                    ar[0]=p1;
                    ar[1]=count+1;
                }
                break;
            }
            else if(s.charAt(p1)==s.charAt(p2))
            {
                count++;
            }
            else if (s.charAt(p1)!=s.charAt(p2) && p2!=s.length()-1)
            {
                if(count>maxlen)
                {
                    maxlen=count;
                    ar[0]=p1;
                    ar[1]=count;
                }
                count=1;
                p1=p2;
            }
            else if (s.charAt(p1)!=s.charAt(p2) && p2==s.length()-1)
            {
                if(count>maxlen)
                {
                    maxlen=count;
                    ar[0]=p1;
                    ar[1]=count;
                }
                count=1;
                p1=p2;
            }

        }


        System.out.println(ar[0]+" "+ar[1]);







    }
}