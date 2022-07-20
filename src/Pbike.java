
public class Pbike {
	int pid;
	String pname;
	int rate;
	public void insert(int id,String name,int r){
		pid=id;
		pname=name;
		rate=r;	
	}
	public Pbike ret(){
		Pbike s=new Pbike();
		s.pid=this.pid;
		s.pname=this.pname;
		s.rate=this.rate;
		return s;
	}
}
