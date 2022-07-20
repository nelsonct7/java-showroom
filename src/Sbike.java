
public class Sbike {
int sid;
String Sname;
int Rate;
public void insert(int id,String name,int r){
	sid=id;
	Sname=name;
	Rate=r;	
}
public Sbike ret(){
	Sbike s=new Sbike();
	s.sid=this.sid;
	s.Sname=this.Sname;
	s.Rate=this.Rate;
	return s;
}
}
