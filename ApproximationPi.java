package for_fun;
import java.util.Random;

public class ApproximationPi {
    public static void main(String[] args) {
        Random random = new Random();

        double coordinates = 100000000; 
        double insideCircle = 0; // counter of the points inside the circle
        for (int i = 0; i <= coordinates; i++) {
            double x = random.nextDouble(100000000);
            double y = random.nextDouble(100000000);
             if ((x*x)+(y*y) <= (coordinates*coordinates)){         // the limit is the radius
                insideCircle++;                                     // hence any point that is less than the circumference is within the circle
             }
           
        }
         double pi = 4*((insideCircle)/(coordinates)); // 
         System.out.println(pi);

        
    }

}
