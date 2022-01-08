public class while6_2_1{

    public static void main(String[] args){
        int a = 1;
        int i = 1;

        while(i<5){
            
            System.out.println(a * i);
            a = a*10 +1;
            i++;
        }
    }
}