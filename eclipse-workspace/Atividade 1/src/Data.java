
public class Data {
	String dia;
	String mes;
	String ano;
	
//	EXERCÍCIO 1
	
//	(a)Um construtor que inicializa os três atributos supondo que os valores fornecidos são corretos.
	Data(String dia, String mes, String ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
//	(b) Os métodos acessadores (get), um para cada atributo.
	public String getDia() {
		return dia;
	}
	
	public String getMes() {
		return mes;
	}
	
	public String getAno() {
		return ano;
	}
	
//	(c) Um método modificador (set) que receba o dia, mês e ano e que modifique os valores dos três atributos. Suponha que os valores fornecidos são corretos.
	public void setData(String dia, String mes, String ano) {
		// sem checagem porque supusemos que os parâmetros estão corretos
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
//	(d) Um método chamado toString que devolva um string com o dia, mês e ano separados por "/".
	@Override
	public String toString() {
		return dia + "/" + mes + "/" + ano;
	}
	
//	(e) Um método chamado trocarCom que permite fazer a troca de duas datas. Esse método deve receber apenas UMA data como parâmetro, não duas.
	public void trocarCom(Data d) {
		String aux;
		
		aux = this.dia;
		this.dia = d.dia;
		d.dia = aux;
		
		aux = this.mes;
		this.mes = d.mes;
		d.mes = aux;
		
		aux = this.ano;
		this.ano = d.ano;
		d.ano = aux;
	}
}
