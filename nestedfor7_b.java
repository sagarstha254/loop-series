public class nestedfor7_b{
    public static void main(String[] args){

        for(int i = 1; i <=1; i++)
        {
            int a = 1111;

            for(int j=1; j<5;j++)
            {
                System.out.println(j * a);
                a = (a -1)/10;
            }
        }

    }
}