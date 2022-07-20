
public class Customer {
	int cid;
	String Cname;
	String CAdrs;
	public void insert(int id,String name,String Adrs){
		cid=id;
		Cname=name;
		CAdrs=Adrs;
	}
	public Customer ret(){
		Customer c=new Customer();
		c.cid=this.cid;
		c.Cname=this.Cname;
		c.CAdrs=this.CAdrs;
		return c;
	}

}
