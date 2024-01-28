public class ClockClass1{

	private int hour;
	private int minute;
	private int second;


	public ClockClass(int hour, int minute, int second){

		if(hour >23){

			this.hour = hour;
		}



		if(minute >59){
			this.minute = minute;
		}


		if(second >59){
		this.second = second;

		}
	}

	public void setHour(int hour){
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       if(hour >23){

			this.hour = hour;
		}

	}

	public int getHour(){
		return hour;
	}

	public void setMinute(int minute){
		if(minute >59){
			this.minute = minute;
		}
	}

	public int getMinute(){
		return minute;
	}

	public void setSecond(int Second){
	if(second >59)this.second = second;

	}
	

	public String getDisplayTime(){
	return" "+ hour  + " " + minute + " " +seconds;
			
	}
		
	
}




