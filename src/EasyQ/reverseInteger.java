package EasyQ;

public class reverseInteger {
    public static void main(String[] args) {
        int x=-1232;
        int remainder;
        int temp=0;
        if(x<0){
            x=x*(-1);
            while(x>0){
                remainder= x%10;
                temp=temp*10+remainder;
                x/=10;
            }
            temp=temp*(-1);
        }else if (x==0){
            temp=0;
        }else{
        while(x>0){
           remainder= x%10;
           temp=temp*10+remainder;
           x/=10;
        }}
        System.out.println(temp);

    }
}
