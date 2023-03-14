package pacote;

public class Pessoa {

	private String Nome;
	private String DataNascimento;
	public Pessoa(String Nome, String DataNascimento) {
		this.Nome = Nome;
		this.DataNascimento = DataNascimento;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public String getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(String DataNascimento) {
		this.DataNascimento = DataNascimento;
	}
	@Override
	public String toString() {
		return "\n"+this.getNome()+'\n'+ 
				this.getDataNascimento()+'\n';
	}
}


