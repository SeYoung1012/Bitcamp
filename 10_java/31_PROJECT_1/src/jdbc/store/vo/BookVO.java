package jdbc.store.vo;

public class BookVO {
	private String id;
	private String name;
	private String writer;
	private String publisher;
	private String classfication;
	private String price;
	private String releasdate;
	
	
	

	
	
	
	
	public BookVO(String id, String name, 
			      String writer, String publisher, 
			      String classfication, String price, 
			      String releasdate) {
		super();
		this.id = id;
		this.name = name;
		this.writer = writer;
		this.publisher = publisher;
		this.classfication = classfication;
		this.price = price;
		this.releasdate = releasdate;
		
	}

	

	public BookVO() {
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}



	public String getClassfication() {
		return classfication;
	}



	public void setClassfication(String classification) {
		this.classfication = classification;
	}



	public String getPrice() {
		return price;
	}



	public void setPrice(String price) {
		this.price = price;
	}



	public String getReleasdate() {
		return releasdate;
	}



	public void setReleasdate(String releasdate) {
		this.releasdate = releasdate;
	}



	@Override
	public String toString() {
		return "BookVO [id=" + id + ", name=" + name + ", writer=" + writer + ", publisher=" + publisher
				+ ", classfication=" + classfication + ", price=" + price + ", releasdate=" + releasdate + "]";
	}

	
}
