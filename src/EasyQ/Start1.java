package EasyQ;

public class Start1 {
    public static void main(String[] args) {
        int []a={1,2};
        int []b={};
        int count=0;
        int lengA=a.length;
        int lengB=b.length;


        if( a.length!=0){
            if(a[0]==1){
            count++;}
        } if( b.length!=0){
            if(b[0]==1){
            count ++;
            }
        }
        System.out.println(count);
    }
}
