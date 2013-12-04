
public class Fila {

	private String [] dados;
	private int head;
	private int tail;
	
	public Fila(int tam){
		head = 0;
		tail = 0;
		dados = new String[tam];			
	}
	
	public String peek(){
		if(!isEmpty())
			return dados[head];
		return null;
	}
	public boolean isEmpty(){
		return head == tail;
	}
	
	
	/*public void push(String value){
		if(!isFull()){
			dados[tail] = value;
			tail++;
		}
	}*/
	public boolean isFull(){
		return nextIndex(tail) == head;
	}
	
	/*public void pop(){
		if(!isEmpty()){
			dados[head] = null;
			head++;
		}
	}*/
	public void pop(){
		if(isEmpty())
			return;
		head = nextIndex(head);
		
		
	}
	public void push(String value){
		if(isFull())
			return;
		dados[tail] = value;
		tail = nextTail();
	}
	public int nextTail(){
		return (tail + 1 ) % dados.length;
	}
	public int nextIndex(int index){
		return (index + 1 ) % dados.length;
	}
}
