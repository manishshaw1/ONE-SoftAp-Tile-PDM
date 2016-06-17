package core;
import java.util.*;

public class Acknowledge {
	private String Ack_ID;
	private DTNHost from;
//	private HashMap<DTHost,String> AckList;
	public Acknowledge(String Ack_id, DTNHost from ){
                //System.out.println("ackno");
		this.from =from;
		this.Ack_ID = Ack_id;
	}
public Acknowledge Generate_ACK(String msg_id, DTNHost from){
	
	String Ack_id = "A_"+msg_id; 
	Acknowledge ack = new Acknowledge(Ack_id,from);
	return ack;
}

public String getackString()
{
   return this.Ack_ID;
}
}
	
