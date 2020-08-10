package mecanicaDAO;

public class Boleto_Add {
	
	private String Descricao;
	private Double Valor;
	private String Data_Vencimento;
	private String Num_Parcelas;
	private String Soma_boletos;
	public String getDescricao() {
		return Descricao;
	}
	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	public Double getValor() {
		return Valor;
	}
	public void setValor(Double valor) {
		Valor = valor;
	}
	public String getData_Vencimento() {
		return Data_Vencimento;
	}
	public void setData_Vencimento(String data_Vencimento) {
		Data_Vencimento = data_Vencimento;
	}
	public String getNum_Parcelas() {
		return Num_Parcelas;
	}
	public void setNum_Parcelas(String num_Parcelas) {
		Num_Parcelas = num_Parcelas;
	}
	public String getSoma_boletos() {
		return Soma_boletos;
	}
	public void setSoma_boletos(String soma_boletos) {
		Soma_boletos = soma_boletos;
	}
	
	
	
}
