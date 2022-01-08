public class while4{
    public static void main(String[] args){
        int a =1;
        int b =1;
        int c =0;
        while (b<9){
            System.out.print(a + ",");
            c = a + b;
            a = b;
            b = c;
        }
    }
}