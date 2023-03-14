package pacote;

public class Professor extends Pessoa{

	private int Siape;
	private String AreaCurso;
	public Professor(String Nome, String DataNascimento, int Siape, String AreaCurso) {
		super(Nome, DataNascimento);
		this.AreaCurso = AreaCurso;
		this.Siape = Siape;
	}
	public int getSiape() {
		return Siape;
	}
	public void setSiape(int Siape) {
		this.Siape = Siape;
	}
	public String getAreaCurso() {
		return AreaCurso;
	}
	public void setAreaCurso(String AreaCurso) {
		this.AreaCurso = AreaCurso;
	}
	@Override
	public String toString() {
		return 	super.toString()+
				this.getSiape()+'\n'+
				this.getAreaCurso();
	}
}
