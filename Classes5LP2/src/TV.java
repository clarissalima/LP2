
public class TV implements IEletronico{

	public boolean ligar = false;
	@Override
	public void ligar() {
		if(!ligar) {
			this.ligar = true;
			System.out.println("Ligando TV...");
		}
		
	}

	@Override
	public void desligar() {
		if(ligar) {
			this.ligar = false;
			System.out.println("Desligando TV...");
		}
		
	}

}
