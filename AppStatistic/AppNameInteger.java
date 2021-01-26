package AppStatistic;

public class AppNameInteger {
	
	String app;
	int rating;
	
	public AppNameInteger(String app, int rating) {
		super();
		this.app = app;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "AppNameInteger [app=" + app + ", rating=" + rating + "]";
	}
	
	

}
