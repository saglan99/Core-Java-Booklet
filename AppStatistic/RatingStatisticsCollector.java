package AppStatistic;

public interface RatingStatisticsCollector{
	
	public void putNewRating(String app, int rating);
	
	public double getAverageRating(String app);
	
	public int getRatingCount(String app);

}
