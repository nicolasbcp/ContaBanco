public class Teste {
	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco();
		c1.setNumConta(11111);
		c1.setTipo("CC");
		c1.setDono("João Mendes");
		c1.setSaldo(10000);
		c1.estadoAtual();
	}
}