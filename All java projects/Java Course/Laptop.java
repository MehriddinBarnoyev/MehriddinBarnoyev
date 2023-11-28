public class Laptop extends Computers{
    public void lap(){
        System.out.println("Laptop");
    }
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.electronik();
        laptop.computer();
        laptop.lap();
    }
    
}
