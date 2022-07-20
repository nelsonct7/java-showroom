import java.util.Scanner;

public class Showroom {
	
	
	
	
public static void main(String arg[]) {
	try{
		int cid=0,pid,sid,r;
		String cn,sn,pn,cad;
		
		Pbike p;
		Sbike s;
	Customer c=new Customer();
	s = new Sbike();
	p = new Pbike();

	Scanner ss = new Scanner(System.in);
	System.out.println("Welcome to the Showroom Enter Customer Details");
	System.out.println("Name : ");
	cn=ss.next();

	System.err.println("Address :");

	cad=ss.next();
	
	cid++;
	c.insert(cid, cn, cad);
	int ch=0;
	System.err.println("Enter Bike 1:sportBike\n2:Parking bike");
	ch=ss.nextInt();
	switch(ch){
	case 1:
		System.out.println("Enter sid :");
		sid=ss.nextInt();
		System.out.println(":Enter bike name");
		sn=ss.nextLine();
		System.out.println("Enter rate");
		r=ss.nextInt();
		s.insert(sid, sn, r);
		break;
	case 2:
		System.out.println("Enter pid :");
		pid=ss.nextInt();
		System.out.println(":Enter bike name");
		pn=ss.nextLine();
		System.out.println("Enter rate");
		r=ss.nextInt();
		p.insert(pid, pn, r);
		break;
	default:System.out.println("Enter a valid choice");
	break;
		
	}
	ss.close();
	Customer cc=c.ret();
	Sbike sss=s.ret();
	Pbike ppp=p.ret();
	System.out.println("Customer "+cc.cid+" "+cc.Cname+" ");
	System.out.println("Sport"+sss.sid+" "+sss.Sname+" "+sss.Rate);
	System.out.println("Public"+ppp.pid+" "+ppp.pname+" "+ppp.rate);
	
	}catch(Exception e){}
}
}
