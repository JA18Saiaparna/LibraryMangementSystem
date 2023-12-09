package com.pojo;

public class Employee
{
	private int eid;
	private String enmae;
	private Address addr;
	
	
	public Employee(int eid, String enmae, Address addr) {
		super();
		this.eid = eid;
		this.enmae = enmae;
		this.addr = addr;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEnmae() {
		return enmae;
	}
	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", enmae=" + enmae + ", addr=" + addr + "]";
}
}
