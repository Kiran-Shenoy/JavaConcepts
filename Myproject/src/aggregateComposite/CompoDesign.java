package aggregateComposite;
import java.util.ArrayList;
import java.util.List;
//Component interface
		interface Graphic {
		    void draw();
		}

		// Leaf class
		class Circle implements Graphic {
		    public void draw() {
		        System.out.println("Drawing a Circle");
		    }
		}

		// Composite class
		class CompositeGraphic implements Graphic {
		    private List<Graphic> graphics = new ArrayList<>();

		    public void add(Graphic graphic) {
		        graphics.add(graphic);
		    }

		    public void remove(Graphic graphic) {
		        graphics.remove(graphic);
		    }

		    public void draw() {
		        for (Graphic graphic : graphics) {
		            graphic.draw();
		        }
		    }
		}

public class CompoDesign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	


		        Graphic circle1 = new Circle();
		        Graphic circle2 = new Circle();

		        CompositeGraphic composite = new CompositeGraphic();
		        composite.add(circle1);
		        composite.add(circle2);

		        System.out.println("Drawing Composite Graphic:");
		        composite.draw();
		   
	}

}
