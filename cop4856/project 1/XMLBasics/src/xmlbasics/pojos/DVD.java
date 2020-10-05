package xmlbasics.pojos;


public class DVD {
    private Integer id;
    private String title;
    private String format;
    private String genre;

    public DVD() {
    }

    public DVD(int id, String title, String format, String genre) {
        this.id = id;
        this.title = title;
        this.format = format;
        this.genre = genre;
    }

	public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

	@Override
	public String toString() {
		return "DVD [id=" + id + ", title=" + title + ", format=" + format + ", genre=" + genre + "]";
	}
    
    
}