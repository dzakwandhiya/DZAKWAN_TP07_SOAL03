public class TP07_SOAL3 {
    public static void main(String[]args){
        for (int bilangan = 0 ; bilangan < 10 ; bilangan++ ){
            System.out.print(fibonacci(bilangan)+" ");
        }
        System.out.println("");
    }
    private static int fibonacci(int bilangan){
        if(bilangan == 1 || bilangan < 2){
            return bilangan;
        }
        else{
            return fibonacci(bilangan - 1) + fibonacci(bilangan - 2);
        }
    }
    
}
