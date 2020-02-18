package ca.yorku.eecs.mcalc;

public class LabTest1 {

    public static void main(String[] args) {
    System.out.println(diffSquares(5,4));
    System.out.println(celsiustoF(17.8));

    }

    public static double diffSquares (int x, int y){
        return x*x - y*y;
    }

    public static String celsiustoF(double degrees){
        double convert = (9.0/5.0)*degrees) + 32;
        return String.format("%.1f", convert);
    }

    //public static String
}
