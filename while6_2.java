public class while6_2{
    public static void main(String[] args){
        int a =1;
        int b =0;
        int s = 1;
        while(a<6){
            System.out.println(s);
            b= (b*10) + 1;
            a++;
            s = s + b;
            s = (s*10) + a;
        }
    }
}