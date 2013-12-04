public class Node {
    
    private String element;
    private String celula;
    private Node next;
    private SList listas;
    
    public Node(String s, Node n , SList d, String celula) {
        setElement(s);
        setCelula(celula);
        setNext(n);
        setListas(d);
        
    }

    private void setCelula(String celula) {
		this.celula = celula;
		
	}
    
	public String getCelula() {
        return celula;
    }
    private void setListas(SList d) {
		this.listas = d;
		
	}
    
	public SList getListas() {
        return listas;
    }
	public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
