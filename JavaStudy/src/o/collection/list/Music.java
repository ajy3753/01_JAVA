package o.collection.list;

public class Music {
	private String title;
	private String artist;

	public Music() {
		super();
	}

	public Music(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	public String getTitle() {
		return this.title;
	}

	public String getArtist() {
		return this.artist;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}
}
