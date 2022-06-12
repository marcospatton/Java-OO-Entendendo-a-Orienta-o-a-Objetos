
public class TestaBanco {
	
	public static void main(String[] args) {
		Cliente marco = new Cliente();
		marco.nome = " Marco Antonio ";
		marco.cpf = "271.223.658-08";
		marco.profissao ="Programador ";
		
		Conta contaDoMarco = new Conta();
		contaDoMarco.deposita(100);
		
		contaDoMarco.titular = marco ;
		System.out.println(contaDoMarco.titular.nome);
		System.out.println(contaDoMarco.titular);
		System.out.println(marco);
	}

}
