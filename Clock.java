public class Clock{

	private int hour;
	private int minute;
	private int second;


	public Clock(int hour, int minute, int second){
	if (hour > 0 && hour <=23){this.hour = hour;}
	if (minute > 0 && minute <=59){this.minute = minute;}
	if (second > 0 && second <=59){this.second = second;}

	}

	public int getHour(){
		return hour;
	}



	public int getMinute(){
		return minute;
	}

	public int getSecond(){
		return second;
	}
	

	public String getDisplayTime(){
	return" "+ hour  + " " + minute + " " +second;
			
	}
		
	
}




