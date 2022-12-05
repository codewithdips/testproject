package Exception;

public class test2 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=10;i++)
        {
            Thread.sleep(500);
            System.out.println(i);
        }

    }
}
