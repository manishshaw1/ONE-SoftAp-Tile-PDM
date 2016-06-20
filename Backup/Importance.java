package core;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import core.Message;
import java.lang.Math;

public class Importance{
	public static double probability;
	public static double difference;
	public static double adf;
	public static double inom;
	public static double imom;

	
	public static double Information_of_msg()
	{
		inom = (double)(Math.log(Probability()) / Math.log(2));
		return inom;
	}
	public static double Probability()
	{
		probability = observed_count/total;
		return (1.0/probability);
	}
	public static double AgeDecayFactor(time1,time2)
	{
		difference = getSimTime() - getCreationTime();
		adf = Math.pow(2.71828, 1.0/difference);
		return adf;
	}
	public static double Importance_of_msg()
	{
		imom = Information_of_msg() * AgeDecayFactor();
		return imom;
	}
}
