package Methods;

public class Room {
	
	int length;
	int width;
	int height;
	int wwarea;
	int wwcost;
	int fcost;
	
	
	Room(int l,int w,int h)
	{
		this.length=l;
		this.width=w;
		this.height=h;
	}
	
	int whiteWashingArea()
	{
		wwarea=2*(length*height)+2*(width*height)+(length*width);
		return wwarea;
	}
	
	int whiteWashingCost()
	{
		wwcost = wwarea*80;
		return wwcost;
	}
	
	int flooringCost()
	{
		fcost=(length*width)*200;
		return fcost;
	}

}
