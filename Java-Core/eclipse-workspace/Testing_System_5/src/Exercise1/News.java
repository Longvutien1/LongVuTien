package Exercise1;

public class News implements INews{

	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private Float averageRate;
	public static int COUNT = 0;
	private int rate[];

	public News(String title, String publishDate, String author, String content, int rate[] ) {
		COUNT++;
		this.id = COUNT;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
//		this.averageRate = averageRate;
		this.rate = rate;

	}
	
// get set
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Float getAverageRate() {
		return averageRate;
	}

	@Override
	public void display() {
		System.out.println("News: title: " + title + ", publishDate: " + 
				publishDate + ", author: " + author + " Content: "+ content   );
		
	}

	@Override
	public float calculate() {
		averageRate = (float) ((rate[0] + rate[1] + rate[2]) / 3);	
		return averageRate;
	}





}
