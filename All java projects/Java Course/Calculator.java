public class Calculator {
    
    public  int add(int a, int b){
        return a +b;
    }
    public int multipy(int a, int b){
        return a * b;
    }

   public int  sub(int a, int b){
        return a - b;
    }
   public int div(int a, int b){
        return a / b;

    }
    public int abs(int a) {
        return Math.abs(a);
    }
    public double pow(int a, int b) {
        return Math.pow(a, b);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,5));
        System.out.println(calculator.multipy(2, 5));
        System.out.println(calculator.sub(15, 5));
        System.out.println(calculator.div(80, 2));
        System.out.println(calculator.abs(20));
        System.out.println(calculator.pow(2, 4));
        
        

}


}
