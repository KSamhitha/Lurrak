package bvrit;

public class BidderDetails {
	private Bid no;
	private Buyer id;
	private int price;
	private String status;
	public BidderDetails() {
	}
	public BidderDetails(Bid no, Buyer id, int price, String status) {
		this.no = no;
		this.id = id;
		this.price = price;
		this.status = status;
		
	}

	@Override
	public String toString() {
		return "BidderDetails [no=" + no + ", id=" + id + ", price=" + price + ", status=" + status + "]";
	}
	public Bid getNo() {
		return no;
	}
	public void setNo(Bid no) {
		this.no = no;
	}
	public Buyer getId() {
		return id;
	}
	public void setId(Buyer id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	}






