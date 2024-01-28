public class CarProperties{

	private String model;
	private String year;
	private double price;
 

	public CarProperties(String model, String year, double price){
		this.model = model;
		this.year = year;

		if(price > 0.0){
			this.price = price;

		}

	}

	public CarProperties(){
	}
	
	public void setModel(String model){
		this.model = model;
	}

	public String getModel(){
		return model;
	}

	public	void setYear(String year){
		this.year = year;

	}

	public String getYear(){

		return year;
	}

	public void setPrice(double price){

		if(price >0.0){
			this.price = price;

		}
	}

	public double getPrice(){
		return price;
	}









}