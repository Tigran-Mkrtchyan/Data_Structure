package am.tech42.datastructure.linkedlist;




public class LinkedList <T> {
	private Link <T> first;
	
	public void insert(T value) {
		Link <T> newLink = new Link <>(value);
		newLink.setNext(first);
		first = newLink;
	}
	
	public Link<T> remove(T value) {
		if (first == null) {
			return null;
		}
		Link <T> current = first;
		Link <T> previous = first;
		if(first.getValue().equals(value)) {
			first = first.getNext();
			return current;
		}else {
			while (!current.getValue().equals(value)) {
				if(current.getNext() != null) {
					previous = current;
					current = current.getNext();
				}else {
					return null;
				}
			}
		}
		previous.setNext(current.getNext());
		return current;
	}
	
	public T removeFirst() {
		if (first == null) {
			return null;
		}
		Link <T> temp = first;
		first = first.getNext();
		return temp.getValue();
	}
	public boolean isEmpty() {
		 return first == null;
	 }
	public void display() {
		Link <T> current = first;
		while (current != null) {
			System.out.println(current.getValue());
			current=current.getNext();
		}
	}
	
}
