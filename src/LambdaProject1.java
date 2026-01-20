public class LambdaProject1 {
    static void main(String[] args) {
        SumofNo result = (int a, int b) -> a + b;

        System.out.println(result.sumof(3,5));
    }
}
@FunctionalInterface
interface SumofNo{
    int sumof(int a,int b);
}