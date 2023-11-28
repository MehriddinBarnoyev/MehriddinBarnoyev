public  class Subwoofer extends Sounds {
    public void Sub(){
        System.out.println("Subwoofer");
    }
    public static void main(String[] args) {
        Subwoofer subwoofer = new Subwoofer();
        
        subwoofer.electronik();
        subwoofer.sound();
        subwoofer.Sub();
    }
    
}
