
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoMarco = new Conta();
		contaDoMarco.saldo = 100;
		contaDoMarco.deposita(50);
		System.out.println(contaDoMarco.saldo);
		
		boolean conseguiuRetirar = contaDoMarco.saca(20);
		System.out.println(contaDoMarco.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaKatia = new Conta();
		contaDaKatia.deposita(1000);
		boolean sucessoTransferencia = contaDaKatia.transfere(3000, contaDoMarco);
		if(sucessoTransferencia){
			System.out.println("transferecia com sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaKatia.saldo);
		System.out.println(contaDoMarco.saldo);
	}

}
