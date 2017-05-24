public class Main {

    public static void main(String[] args){
        int num = Integer.parseInt(args[0]);
        generate(num);
    }

    public static void generate(int num){

        for(int i=2;(i<num/2);i++){
            if(num%i == 0 && isPrime(i)){
                System.out.print(i + " ");
            }
        }
        if(num==2 || num==3){
            System.out.println(num + " ");
        }
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n/2;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
