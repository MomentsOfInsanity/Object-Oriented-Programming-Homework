package p4;

public class Textbook
{
	private String title;
	private String author;
	private String isbn;
	private double price;
	
	public Textbook(String title, String author, String isbn, double price)
	{
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.price = price;
	}
	
	public Textbook(Textbook textbook)
    {
        this.title = textbook.title;
        this.author = textbook.author;
        this.isbn = textbook.isbn;
        this.price = textbook.price;
    }

	public String getTitle() 
	{
		return title;
	}

	public void setTitle(String title) 
	{
		this.title = title;
	}

	public String getAuthor() 
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public String getIsbn() 
	{
		return isbn;
	}

	public void setIsbn(String iSBN) 
	{
		isbn = iSBN;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	@Override
	public String toString() 
	{
		return "Textbook [title=" + title + ", author=" + author + ", ISBN=" + isbn + ", price=" + price + "]";
	}

}
