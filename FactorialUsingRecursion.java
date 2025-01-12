public class FactorialNumber {
    static int recursion(int n){
        if(n<0){
            System.out.println("Not Possible");
        }
        if(n==1){
            return 1;
        }
        return n*recursion(n-1);
    }
    public static void main(String args[]){
        int fact=1;
        for(int i=1; i<=5; i++){
            fact=fact*i;
        }
        System.out.println(recursion(4));
    }
}
