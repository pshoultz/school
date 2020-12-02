package entities;

public class DVD {
	private Integer id;
    private String title;
    private String format;
    private String genre;
    private int score;

    public DVD() {
    }

    public DVD(int id, String title, String format, String genre, int score) {
        this.id = id;
        this.title = title;
        this.format = format;
        this.genre = genre;
        this.score = score;
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
    
    public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setId(int id) {
        this.id = id;
    }
}
