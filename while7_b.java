public class while7_b{
    public static void main(String[] args){
        
        int a = 1111;
        int i =1;
        
        while(i<5){
            
            System.out.println( a * i);
            a = (a-1) / 10;
            i++;
            
        }
    }
}