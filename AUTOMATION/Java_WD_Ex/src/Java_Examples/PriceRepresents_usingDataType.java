package Java_Examples;

import java.math.BigDecimal;

public class PriceRepresents_usingDataType {
	 public static void main(String[] args) {
	        BigDecimal price = new BigDecimal("99.99");
	        BigDecimal tax = new BigDecimal("0.18");
	        BigDecimal total = price.add(price.multiply(tax));

	        System.out.println("Total Price with Tax: ₹" + total);
	    }
}
