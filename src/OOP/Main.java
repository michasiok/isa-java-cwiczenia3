package OOP;
import OOP.figures.Diamond;
import OOP.figures.Rectangle;
import OOP.figures.Square;

public class Main {
    public static void main(String[] args) {
        Diamond smallDiamond = new Diamond("czerwony",10,15);
        Diamond bigDiamond = new Diamond("niebieski", 30, 50);
        System.out.println("Pole rombu małego: " + smallDiamond.countArea());
        System.out.println("Pole rombu dużego: " + bigDiamond.countArea());

        Rectangle smallRectangle = new Rectangle("fioletowy",8,5);
        System.out.println("Pole prostokąta :" + smallRectangle.countArea());
        System.out.println("Obwód prostokąta :" + smallRectangle.countPerimeter());

        Square smallSquare = new Square("czerwony", 2);

        System.out.println(smallSquare.countArea());
        System.out.println(smallRectangle.countArea());
        System.out.println(smallSquare.countPerimeter());
        System.out.println(smallRectangle.countPerimeter());

    }
}
