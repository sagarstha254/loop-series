public class while7{

    public static void main(String[] args){
        
        int a = 11111;
        int i = 5;

        while(i>0){

            System.out.println(a * i);
            a = (a-1)/10;
            i--;
        }
    }
}