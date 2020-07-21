package am.tech42.datastructure.linkedlist;


public class DoublyLinkedList <T>{
	private Link<T> first;
	private Link<T> last;
	
	public void insertFirst(T value) {
		Link <T> newLink = new Link<>(value);
		if (first == null) {
			last = newLink;
		}
		else {
			first.setPrevious(newLink);
		}
		newLink.setNext(first);
		first = newLink;
	}

	public void insertLast(T value) {
		Link <T> newLink = new Link<>(value);
		if (first == null) {
			first = newLink;
		}
		else {
			last.setNext(newLink);
		}
		newLink.setPrevious(last);
		last = newLink;
	}

	public T removeFirst(){
		if (first == null) {
			return null;
		}
		if (first.getNext() == null) {
			last = null;
		}else {
			first.getNext().setPrevious(null);
		}
		Link<T> temp = first;
		first = first.getNext();
		return temp.getValue();
	}

	public T removeLast(){
		if (first == null) {
			return null;
		}
		Link<T> temp = last;
		if (first == last) {
			first = null;
		}
		else {
			last.getPrevious().setNext(null);
		}
		last = last.getPrevious();
		return temp.getValue();
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

	public Link<T> remove(T value) {
		if(first == null) {
			return null;
		}
		Link<T> current = first;
		if(current.getValue().equals(value)) {
			if(first == last) {
				last = null;
			}else {
				first.getNext().setPrevious(null);
			}
			first = first.getNext();
			return current;
		}else {
			while (!current.getValue().equals(value)) {
				if(current.getNext() == null) {
					return null;
				}else {
					current = current.getNext();
				}
			}
		}
		if(current == last) {
			last = last.getPrevious();
		}else{
			current.getNext().setPrevious(current.getPrevious());
		}
		current.getPrevious().setNext(current.getNext());
		return current;
	}

}