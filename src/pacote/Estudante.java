package pacote;

public class Estudante extends Pessoa{
	
	private int RA;
	private String Curso;
	public Estudante(String Nome, String DataNascimento, int RA, String Curso) {
		super(Nome, DataNascimento);
		this.RA = RA;
		this.Curso = Curso;
	}
	public int getRA() {
		return RA;
	}
	public void setRA(int RA) {
		this.RA = RA;
	}
	public String getCurso() {
		return Curso;
	}
	public void setCurso(String Curso) {
		this.Curso = Curso;
	}
	@Override
	public String toString() {
		return 	super.toString()+
				this.getRA()+'\n'+
				this.getCurso();
	}

}
