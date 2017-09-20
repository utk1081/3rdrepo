package pro;

public class DemoTest {
public static void main(String[] args) throws CloneNotSupportedException {
	BookShop bs= new BookShop();
	//System.out.println(bs);
	bs.setShopName("utkBookShopCenter1");
	bs.loadData();
	System.out.println(bs);
	//bs.getBooks().remove(1);
//2
	BookShop bs1= (BookShop) bs.clone();
	bs.getBooks().remove(1);

	bs1.setShopName("utkBookShopCenter2");
	//bs1.loadData();
	System.out.println(bs1);

	
}
}
