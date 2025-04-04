package ArrayOfObjects;

public class InitializingUsing_Constructor {
	public static void main(String args[]) {
		// create an array of product object
		Product[] obj = new Product[5];
		// create & initialize actual product objects using constructor
		obj[0] = new Product(23907, "Dell Laptop");
		obj[1] = new Product(91240, "HP 630");
		obj[2] = new Product(29823, "LG OLED TV");
		obj[3] = new Product(11908, "MI Note Pro Max 9");
		obj[4] = new Product(43590, "Kingston USB");
		// display the product object data
		obj[0].display();
		obj[1].display();
		obj[2].display();
		obj[3].display();
		obj[4].display();
	}
}

//Product class with product_Id and product_name as attributes  
class Product {
	int pro_Id;
	String pro_name;

	//initialize Array Of Objects 'using constructor' 
	Product(int pid, String pname) {
		pro_Id = pid;	//this.pro_Id = pid
		pro_name = pname;	//this.pro_name = pname;
	}

	public void display() {
		System.out.print("Product Id = " + pro_Id + "  " + " Product Name = " + pro_name);
	}
}
