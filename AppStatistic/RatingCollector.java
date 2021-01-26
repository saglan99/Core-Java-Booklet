package AppStatistic;

import java.util.ArrayList;
import java.util.List;

public class RatingCollector implements RatingStatisticsCollector
{
	List<AppNameInteger> li = new ArrayList<AppNameInteger>();
	
	public void putNewRating(String app, int rating) 
	{
		li.add(new AppNameInteger(app, rating));
	}
	
	public double getAverageRating(String app)
	{
		return 0;
		
	}
	
	public int getRatingCount(String app)
	{
		return 0;
		
	}

	
	
}
