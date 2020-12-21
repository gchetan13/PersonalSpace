package com.spring.models;

public  class SingletonEmployee {
AddressPrototype addressPrototype;

public  AddressPrototype getAddressPrototype(){
	return new AddressPrototype();
};

public void setAddressPrototype(AddressPrototype addressPrototype) {
	AddressPrototype prototype = new AddressPrototype();
	this.addressPrototype = prototype;
}

public SingletonEmployee(AddressPrototype addressPrototype) {
	super();
	this.addressPrototype = addressPrototype;
}

}
