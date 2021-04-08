package br.com.bytebank.bank.modelo;

public abstract class Conta {

	// double saldo => package private = visível somente dentro da classe e do pacote
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0;

	// Construtor
	public Conta(int agencia, int numero) {
		Conta.total++;
		// System.out.println("O total de contas abertas é: " + Conta.total);
		if(agencia < 1) {
			throw new IllegalArgumentException("Agencia invalida");
		};
		if(numero < 1) {
			throw new IllegalArgumentException("Numero da conta invlido");
		}
		// System.out.println("estou criando uma conta " + this.numero +" Na Agencia: "+
		// this.agencia);
	}

	// Métodos
	public abstract void deposita(double valor);

	public void saca(double valor) throws SaldoInsuficienteException {
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", valor: " + valor);
		}

		this.saldo -= valor;

	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {

		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public Cliente getTitular() {
		return this.titular;
	}

	// Método da classe
	public static int getTotal() {
		return Conta.total;
	}
}