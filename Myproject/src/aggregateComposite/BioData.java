package aggregateComposite;
class Heart
{
	private int weight;
	private int bpm;
	public Heart(int weight,int bpm)
	{
		this.weight=weight;
		this.bpm=bpm;
	}
	public int getWeight() {
		return weight;
	}
	public int getBpm() {
		return bpm;
	}
	
}
class Brain
{
	private int weight;
	private String colour;
	public Brain(int weight,String colour)
	{
		this.weight=weight;
		this.colour=colour;
	}
	public int getWeight() {
		return weight;
	}
	public String getColour() {
		return colour;
	}
	
}

class Bike
{
	private String brand;
	private int mileage;
	public Bike(String brand,int mileage)
	{
		this.brand=brand;
		this.mileage=mileage;
	}
	public String getBrand() {
		return brand;
	}
	public int getMileage() {
		return mileage;
	}
	
}

class Book
{
	private String name;
	private String author;
	public Book(String name,String author)
	{
		this.name=name;
		this.author=author;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	
}

class Student
{
	Heart h=new Heart(289,72);
	Brain b=new Brain(1400,"Grey");
	
	void hasA(Bike bi)
	{
		System.out.println(bi.getBrand());
		System.out.println(bi.getMileage());
	}
	void hasA(Book bo)
	{
		System.out.println(bo.getName());
		System.out.println(bo.getAuthor());
	}
	
}
public class BioData {

	public static void main(String[] args) {
		
		Bike bi=new Bike("Duke",35);
		Book bo=new Book("JAVA","JG");
		
		Student st=new Student();
		System.out.println(st.h.getWeight());
		System.out.println(st.h.getBpm());
		
		System.out.println(st.b.getWeight());
		System.out.println(st.b.getColour());
		
		st.hasA(bi);
        st.hasA(bo);		
        
        st=null;
//        System.out.println(st.h.getWeight());
//		System.out.println(st.h.getBpm());
//		
//		System.out.println(st.b.getWeight());
//		System.out.println(st.b.getColour());
//		
//		st.hasA(bi);
//        st.hasA(bo);
        
        System.out.println(bi.getBrand());
		System.out.println(bi.getMileage());
		System.out.println(bo.getName());
		System.out.println(bo.getAuthor());
        
        
		

	}

}
