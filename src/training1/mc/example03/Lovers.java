package training1.mc.example03;

public class Lovers {
	private String male;
	private String famale;
	private long weddingDate;

	public Lovers() {

	}

	public Lovers(String male, String famale, long weddingDate) {
		super();
		this.male = male;
		this.famale = famale;
		this.weddingDate = weddingDate;
	}

	public void wedding() {
		System.out.println("祝贺" + male + "和" + famale + "在" + weddingDate + "举行婚礼");
	}

	public String getMale() {
		return male;
	}

	public void setMale(String male) {
		this.male = male;
	}

	public String getFamale() {
		return famale;
	}

	public void setFamale(String famale) {
		this.famale = famale;
	}

	public long getWeddingDate() {
		return weddingDate;
	}

	public void setWeddingDate(long weddingDate) {
		this.weddingDate = weddingDate;
	}

}
