/* Problem Statement:
Write a program to create a class Book with the following data members: isbn, title and price. Inherit two derived classes : Magazine and Novel from book with the following data members: Magazine: type; Novel : author Populate the details using constructors. Create a magazine and Novel and display the details by using overridden display message.
*/

class Book {
	int isbn;
	String title;
	int price;
	
	Book(int isbn, String title, int price)
	{
		this.isbn=isbn;
		this.title=title;
		this.price=price;
	}
        public void  display(){
                System.out.println("\nISBN : "+isbn+"\nTitle: "+title+"\nprice: "+price);
        } 
}

class Magzine extends Book {
	String type;

	Magzine(int isbn, String title, int price, String type) {
	    super(isbn, title, price); 
	    this.type=type;
	}
	@Override
	public void display(){
		System.out.println("\nISBN : "+isbn+"\nTitle: "+title+"\nprice: "+price+"\nType:"+type);
	}
}

class Novel extends Book {
	String author;

	Novel(int isbn, String title, int price, String author) {
	    super(isbn, title, price);
	    this.author=author;
	}
	@Override
	public void display(){
	System.out.println("\nISBN : "+isbn+"\nTitle: "+title+"\nprice: "+price+"\nAuthor:"+author);
	}
 	void partly_display(){
		super.display();
	}
}

class library{
     public static void main(String args []){
        Book b = new Book(1231132,"This World",1234);
        Magzine m = new Magzine(1234567,"The Time",200,"Monthly");
        Novel n = new Novel(1234345,"The Ultimate Book of Coding",1200,"Gegory Jr");
        b.display();
        m.display();
        n.display();
        n.partly_display();
     }
}
