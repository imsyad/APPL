
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Icad
 */
public class PaintThings {
    public static void main(String[] args) {
        
        final double COVERAGE = 350;
        Paint paint = new Paint(COVERAGE);
        
        Rectangle deck = new Rectangle(20,35);
        Sphere bigBall = new Sphere(15);
        Cylinder tank = new Cylinder(10, 30);
        
        double deckAmt = paint.amount(deck), ballAmt = paint.amount(bigBall), tankAmt = paint.amount(tank);
        
        DecimalFormat fmt = new DecimalFormat("0.#");
        System.out.println("\nNumber of gallons of paint needed...");
        System.out.println("Deck " + fmt.format(deckAmt));
        System.out.println("BigBall " + fmt.format(ballAmt));
        System.out.println("Tank " + fmt.format(tankAmt));
    }
}
