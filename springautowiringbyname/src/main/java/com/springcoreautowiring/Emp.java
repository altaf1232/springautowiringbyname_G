package com.springcoreautowiring;

public class Emp 
{
   private Address address;
   //ya aap key refrence variavel ka name aaur <bea> class ka name name huna chaye
   //Example <address aaur address ka name same huna chaye

public Address getAddress() 
{
	return address;
}

public void setAddress(Address address) 
{
	this.address = address;
}

public Emp() 
{
	super();
	// TODO Auto-generated constructor stub
}

public Emp(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}
   


}