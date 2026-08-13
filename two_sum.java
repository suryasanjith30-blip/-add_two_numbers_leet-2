import java.util.*;

class sum1{
    int count(dlist head1,dlist head2){
        if(head1==null && head2==null){
            return 0;
            
        }

       
        dlist temp1=head1;
        dlist temp2=head2;
        String  sum="";
        if(head1==null && head2!=null){
            while(temp2.next!=null){
                temp2=temp2.next;
                


            }
        
            while(temp2!=null){
                sum+=String.valueOf(temp2.value);
                temp2=temp2.pre;
            }
            int a1=Integer.parseInt(sum);
            temp2=head2;
            return a1;
        }
        if(head2==null && head1!=null){
            while(temp1.next!=null){
                temp1=temp1.next;
                


            }
        
            while(temp1!=null){
                sum+=String.valueOf(temp1.value);
                temp1=temp1.pre;
            }
            int a2=Integer.parseInt(sum);
            temp1=head1;
            return a2;
        }

        int count1=1;
        int count2=1;
       while(temp1.next!=null){
            count1+=1;
            temp1=temp1.next;

       }
        while(temp2.next!=null){
            count2+=1;
            temp2=temp2.next;
            
       }
       if(count1!=count2){
            if(count1>count2){
                while (count1!=count2){
                    temp2.next=new dlist(0);
                    temp2.next.pre=temp2;
                    count2+=1;
                    temp2=temp2.next;
                    
                }
            
            }
            else if(count2>count1){
                while(count1!=count2){
                    temp1.next=new dlist(0);
                    temp1.next.pre=temp1;
                    count1+=1;
                    temp1=temp1.next;

                    


                }

            }

            

       }
      
       String  sum1="";
       while(temp1!=null){
        sum+=String.valueOf(temp1.value);
        sum1+=String.valueOf(temp2.value);
        temp1=temp1.pre;
        temp2=temp2.pre;
        


        

       }
      int  val1=Integer.parseInt(sum);
      int val2=Integer.parseInt(sum1);
      int l_sum=val1+val2;
    return l_sum;

       




    }
}

public class two_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sum1 s=new sum1();
        System.out.println( "Enter the value of head1");
        int he1=sc.nextInt();
        System.out.println("Enter the value of head 2");
        int he2=sc.nextInt();

        
        dlist head1=new dlist(he1);
        dlist head2=new dlist(he2);
        dlist temp=head1;
        dlist tem1=head2;
        
        System.out.println("Enter the number of elements do u want to enter for list 1");
        int len=sc.nextInt();
        for(int i=1;i<=len;i++){
            System.out.println("Enter the value to ");
            int val=sc.nextInt();
            temp.next=new dlist(val);
            temp.next.pre=temp;
            temp=temp.next;

        }
        System.out.println("Enter the number of values u want to enter in the second list");
        int val1=sc.nextInt();
        for(int j=1;j<=val1;j++){
             System.out.println("Enter the value to ");
            int val=sc.nextInt();
            tem1.next=new dlist(val);
            tem1.next.pre=tem1;
            tem1=tem1.next;


        }

        int val=s.count(head1, head2);
        System.out.println("the value is "+val);
        
    }
    
}
