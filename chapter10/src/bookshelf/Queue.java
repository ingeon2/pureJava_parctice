package bookshelf;

public interface Queue {
	
	void enQueue(String Title);
	String deQueue();
	int getSize();
}
