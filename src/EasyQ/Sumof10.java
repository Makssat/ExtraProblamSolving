package EasyQ;

public class Sumof10 {
    public static void main(String[] args) {
        int firstNum=1;
        int sum=0;
        while(firstNum<11){
            sum=firstNum+sum;
            firstNum++;
        }
        System.out.println(sum);
    }
}
