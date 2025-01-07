package Singleton;

public class Stationn {
    private String name;
    private String location;

    public Stationn(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void getInfo() {
        System.out.println("Station Name: " + name);
        System.out.println("Location: " + location);
    }
}

public class TrainStationn extends Stationn {
    private int platforms;

    public TrainStationn(String name, String location, int platforms) {
        super(name, location);
        this.platforms = platforms;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Number of Platforms: " + platforms);
    
        
    }
}

public class StationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrainStationn ts = new TrainStationn("Central Station", "Downtown", 5);
        ts.getInfo();
	}

}
