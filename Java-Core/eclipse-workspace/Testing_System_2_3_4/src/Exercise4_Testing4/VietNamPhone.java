package Exercise4_Testing4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class VietNamPhone extends Phone {

	private ArrayList<Contact> arr = new ArrayList<Contact>();

	@Override
	public void insertContact(String name, String phone) {
		Contact contact = new Contact(name, phone);
		arr.add(contact);
		
	}

	@Override
	public void removeContact(String name) {
		arr.removeIf(arr -> arr.getName().equals(name));
		
	}

	@Override
	public void updateContact(String name, String newPhone) {
		for (Contact contact : arr) {
			if (contact.getName().equals(name)) {
				contact.setPhone(newPhone);
			}
		}
		
	}

	@Override
	public void searchContact(String name) {
		for (Contact contact : arr) {
			if (contact.getName().equals(name)) {
				System.out.println(contact);
			}
		}
		
	}
	
	public void printContact() {
		for (Contact contact : arr) {
		System.out.println(contact);
		}
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
