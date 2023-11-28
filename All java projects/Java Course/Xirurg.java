public class Xirurg extends Doctor {
    public void  surgical(){
        System.out.println("Surgical");
    }
    public static void main(String[] args) {
        Xirurg xirurg = new Xirurg();
        xirurg.biology();
        xirurg.surgical();
    }
    
}
