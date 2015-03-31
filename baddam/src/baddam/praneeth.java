package baddam;

class praneeth {
public static void main(String[] args)
{
	
pra me = new pra();
System.out.println(me.toString());
	me.setTime(13,12,10);
	System.out.println(me.toString());
	
}
}
public class pra
{

private int hour;
private int minute;
private int second;

public void setTime(int h,int m,int s)
{
	hour=  ((h>=0 && h<24)? h:0);
	minute=((m>=0 && m<60)? m:0);
	second=((s>=0 && s<60)? s:0);
}
public String toString()
{
	return String.format("%d:%O2d:%O2d %s", ((hour==0||hour==12)? 12:hour%12),minute,second,(hour<12 ? "am":"pm")); 
}
}


