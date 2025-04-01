package Java1_Tasks;

public class Task3 {
    private String brand;
	private String model;
	private int year;

	Task3(String brand,String model,int year){
		this.brand=brand;
		this.model=model;
		this.year=year;
	}

	public void setBrand(String brand) {
		this.brand=brand;
	}

	public void setModel(String model) {
		this.model=model;
	}

	public void setYear(int year) {
		this.year=year;
	}

	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
		Task3 cr1=new Task3("Mahindra","Bolero",2010);
		Task3 cr2=new Task3("Maruti","800",2000);
		System.out.println("Car 1: " + cr1.getBrand() + " " + cr1.getModel() + " (" + cr1.getYear() + ")");
	    System.out.println("Car 2: " + cr2.getBrand() + " " + cr2.getModel() + " (" + cr2.getYear() + ")");
	}
}
