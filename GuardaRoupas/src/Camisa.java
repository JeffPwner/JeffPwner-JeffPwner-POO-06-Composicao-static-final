
public class Camisa extends Vestimenta{
	private String tipo;
	private int numero;
	
	@Override
	public String toString() {
		return "Camisa [tipo=" + tipo + ", numero=" + numero + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
