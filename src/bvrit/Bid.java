package bvrit;

public class Bid {
	private int no;
	private Land land;
	private int marketPrice;
	private Owner id;
	
	public Bid() {
	}
	public Bid(int no, Land land, int marketPrice, Owner id) {
		this.no = no;
		this.land = land;
		this.marketPrice = marketPrice;
		this.id = id;
		
	}

	@Override
	public String toString() {
		return "Bid [no=" + no + ", land=" + land + ", marketPrice=" + marketPrice + ", id=" + id + "]";
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public Land getLand() {
		return land;
	}
	public void setLand(Land land) {
		this.land = land;
	}
	public int getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(int marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Owner getId() {
		return id;
	}
	public void setId(Owner id) {
		this.id = id;
	}
	
	}



