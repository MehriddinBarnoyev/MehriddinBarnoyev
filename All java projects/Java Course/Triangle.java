public  class Triangle extends GeometrikFigure {
    @Override

    public void area(){
        System.out.println("Triangle");

        double sideA = 7;
        double sideB = 8;
        double sideC = 9;

        double result = sideA + sideB + sideC;
        System.out.println(result); 

    }
    
}