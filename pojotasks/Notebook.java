package pojotasks;

public class Notebook {

	private String brand = "Classmate";
	private String size = "King Size";
	private String type = "Un-ruled";
	private int pages = 160;
	private float price = 40f;

	public String getBrand() {
		return brand;
	}

	public String getSize() {
		return size;
	}

	public String getType() {
		return type;
	}

	public int getPages() {
		return pages;
	}

	public float getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return this.getBrand() + ", " + this.getSize() + ", " + 
			   this.getType() + ", " + this.getPages() + ", " + 
			   this.getPrice();
	}

	public static void main(String[] args) {
		Notebook notebook = new Notebook();
		System.out.println(notebook);
	}

}