package pro;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable{
	
private String shopName;
private List<Book> books= new ArrayList<>();

/*@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}*/
@Override
protected BookShop clone() throws CloneNotSupportedException {
	BookShop bk= new BookShop();
	for (Book	 book : this.getBooks()) {
		bk.getBooks().add(book);
	}
	
	

	
	
	//shallo copy and deep copy, shallo is defalu while deep we need to customise for clone method
	
	return bk;
}
public void loadData(){
	for(int i=0;i<=10;i++){
		Book b= new Book();
		b.setBid(i);
		b.setBname("Book "+i);
		getBooks().add(b);
	}
}

public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return shopName+" "+books;
	}

}
