package Questions;
//Calcuate the angle between the hour hand and minute hand for any given time.

public class closeAngle {
	public static void main(String[] args) {
		int hour, minute, angleh, anglem;
		String time=args[0];
//		System.out.println(time);
		
		if (time.indexOf(":") < 0) {
			System.out.println("Time format wrong");
			return;
		}
//		System.out.println(time.substring(0, (time.indexOf(":"))));
		
		
		
		hour=Integer.parseInt(time.substring(0, (time.indexOf(":"))));
//		System.out.println(time.substring(time.indexOf(":")+1));
		minute=Integer.parseInt(time.substring((time.indexOf(":")+1)));
//			another way to get hour and minute it to use String.split()
//		String[] parts = time.split(":");
//		hour = Integer.parseInt(parts[0]);
//		minute = Integer.parseInt(parts[1]);
		if (hour<0 || hour>12) {
			System.out.println("Hour is wrong");
			return;
		} else if (minute <0 || minute>59) {
			System.out.println("Minute is wrong");
			return;
		}
		
		angleh = (hour*360*1/12) + (minute*360*1/12/60);
		anglem = minute*360/60;
		System.out.println("hour is " + hour);
		System.out.println("minute is " + minute);
		System.out.println("angleh is " + angleh);
		System.out.println("anglem is " + anglem);
		if (angleh==anglem || ((angleh-anglem)==360) || ((anglem-angleh)==360))	 {
			System.out.println("Angle is 0");
		} else if (angleh>anglem) {
			System.out.println("Angle is " + (angleh-anglem));
		} else if (anglem>angleh) {
			System.out.println("Angle is " + (anglem-angleh));
		}
	}
}

