public interface CS112QueueInterface
{
	void writeQueue();

	void enqueue(int j);

	int dequeue();

	boolean isEmpty();
	
	int peek();
}