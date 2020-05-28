import java.util.*;
class Volume
{
	 
	double vol(double x,double y,double z) 
	{
		double vol;
		vol=x*y*z;
		return(vol);
	}
	
}
public class cl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double h, w, d;
		Scanner in = new Scanner(System.in);
		Volume a =new Volume();
		h=in.nextDouble();
		w=in.nextDouble();
		d=in.nextDouble();
		double v=a.vol(h, w, d);
		System.out.println("volume is "+v);
	}

}