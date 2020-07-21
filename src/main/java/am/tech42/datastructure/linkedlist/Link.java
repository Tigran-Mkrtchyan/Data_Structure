package am.tech42.datastructure.linkedlist;

class Link <T>{
	private Link<T> next ;
	private Link<T> previous ;
	private T value ;

	public Link(T value) {
		this.value = value;
	}

	public Link<T> getNext() {
		return next;
	}

	public void setNext(Link<T> next) {
		this.next = next;
	}

	public T getValue() {
		return value;
	}

	public Link<T> getPrevious() {
		return previous;
	}
	
	public void setPrevious(Link<T> previous) {
		this.previous = previous;
	}

}
