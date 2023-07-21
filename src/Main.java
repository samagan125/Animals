import animals.Animals;
import animals.Eagle;
import animals.Shrk;
import animals.Turtle;

public class Main {
    public static void main(String[] args) {
        Turtle turtle = new Turtle();
        Shrk shrk = new Shrk();
        Eagle eagle = new Eagle();
        Animals[] animals = {turtle, shrk, eagle};
        for (Animals animals1 : animals) {
            if (animals1 instanceof Turtle) {
                ((Turtle) turtle).swim();
            } else if (animals1 instanceof Shrk) {
                ((Shrk) shrk).attack();
            }else  {
                    ((Eagle) eagle).fly();
                }
            }
        }
    }
