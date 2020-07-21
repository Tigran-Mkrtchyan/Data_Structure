package am.tech42.datastructure.linkedlist;


public class TwoSideLinkedList <T>{
	private Link <T> first;
	private Link <T> last;
	public Link <T> getLast() {
		return last;
	}
	public void setLast(Link <T> last) {
		this.last = last;
	}
	public Link <T> getFirst() {
		return first;
	}
	public void setFirst(Link <T> first) {
		this.first = first;
	}
	
	public void insertFirst(T value) {
		Link<T> newLink = new Link<>(value);
		if(first == null) {
			last = newLink;
		}
		else {
			newLink.setNext(first);
		}
		first = newLink;
	}
	public void insertLast(T value) {
		Link<T> newLink = new Link<>(value);
		if(first == null) {
			first = newLink;
		}
		else {
			last.setNext(newLink);
		}
		last = newLink;
	}
	public T removeFirst() {
		if(first == null) {
			return null;
		}
		if (first == last) {
			last= null;
		}
		Link <T> temp = first;
		first = first.getNext();
		return temp.getValue();
	}
	public Link<T> remove (T value) {
		if(first == null) {
			return null;
		}
		Link <T> current  = first;
		Link <T> previous = first;
		if (current.getValue().equals(value)) {
			if(first == last) {
				last = null;
			}
			first = first.getNext();
			return current;
		}else {
			while (!current.getValue().equals(value) ) {
				if(current.getNext() != null) {
					previous = current;
					current = current.getNext();
				}else {
					return null;
				}
			}
		}
		if (current == last) {
			last = previous;
		}
		previous.setNext(current.getNext());
		
		return current;
	}
	public void display() {
		Link <T> current = first;
		while (current != null) {
			System.out.println(current.getValue());
			current=current.getNext();
		}
	}
	public boolean isEmpty() {
		return first == null;
	}
	
}