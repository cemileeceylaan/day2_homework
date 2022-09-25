package classeswithAttribute;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Product product = new  Product();
			
			product.setId(1);
			product.setKod("0179");
			product.setName("laptop");
			product.setPrice(12369.79);
			product.setRenk("siyah");
			product.setDescription("indirimli");
			
			ProductManager productManager = new ProductManager();
			productManager.Add(product);
	}



}
