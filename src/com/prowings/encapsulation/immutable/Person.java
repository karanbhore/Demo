package com.prowings.encapsulation.immutable;

public final class Person {

	private final String name;
	private final int pid;
	private final Address address;

	public Person() {
		super();
		this.name = "";
		this.pid = 0;
		this.address = new Address();
	}

	public Person(String name, int pid, Address address) {
		super();
		this.name = name;
		this.pid = pid;
		this.address = address;
//		Address dummyAddress=new Address();
//		dummyAddress.setCity(address.getCity());
//		dummyAddress.setPin(address.getPin());
//		this.address=dummyAddress;
	}

	public String getName() {
		return name;
	}

	public int getPid() {
		return pid;
	}

	public Address getAddress() {

//		Address dummyAddress=new Address();
//		dummyAddress.setCity(this.address.getCity());
//		dummyAddress.setPin(this.address.getPin());
//		return dummyAddress;
		return address;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", pid=" + pid + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Address addr = new Address("BIHAR", 120);
		Person person = new Person("Shamalal", 4560, addr);
		System.out.println(person);
		System.out.println();

		addr.setCity("Dubai");
		System.out.println(person);

	}

}
