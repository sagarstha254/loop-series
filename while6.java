public class while6{
    public static void main(String[] args){
        int a = 2;
        int b = 1;
        while( a < 6){
            System.out.println(b);
            b = (b * 10) + a;
            a = a + 1;
            
        }
    }
}