//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    RedBlockchain redActual;

    redActual = new RedBitcoin();
    System.out.println("=== OPERACIÓN EN RED BITCOIN ===");
    try {
        String walletBtcOrigen = "1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa";
        String walletBtcDestino = "3J98t1WpEZ73CNmQviecrnyiWrnqRhWNLy";

        double saldo = redActual.verificarSaldo(walletBtcOrigen);
        System.out.println("Saldo disponible: " + saldo + " BTC");

        redActual.ejecutarTransaccion(walletBtcOrigen, walletBtcDestino, 0.25);
        System.out.println("Estado: Transacción confirmada en la cadena.\n");
    } catch (Exception e) {
        System.err.println(e.getMessage() + "\n");
    }

    redActual = new RedEthereum();
    System.out.println("=== OPERACIÓN EN RED ETHEREUM ===");
    try {
        String walletEthOrigen = "0x71C3482522736C2F7A8532F97b4E3c76d0815774";
        String walletEthDestino = "0x55A687D43949805903b7b399F6005c2a13532C3B";

        double saldo = redActual.verificarSaldo(walletEthOrigen);
        System.out.println("Saldo disponible: " + saldo + " ETH");

        redActual.ejecutarTransaccion(walletEthOrigen, walletEthDestino, 1.5);
        System.out.println("Estado: Smart Contract ejecutado con éxito.\n");
    } catch (Exception e) {
        System.err.println(e.getMessage() + "\n");
    }

    redActual = new RedSolana();
    System.out.println("=== OPERACIÓN EN RED SOLANA ===");
    try {
        String walletSolOrigen = "TokenkegQfeZyiNwAJbNbGKPFXCWuBvf9Ss623VQ5DA";
        String walletSolDestino = "So11111111111111111111111111111111111111112";

        double saldo = redActual.verificarSaldo(walletSolOrigen);
        System.out.println("Saldo disponible: " + saldo + " SOL");

        redActual.ejecutarTransaccion(walletSolOrigen, walletSolDestino, 25.0);
        System.out.println("Estado: Bloque validado instantáneamente.\n");
    } catch (Exception e) {
        System.err.println(e.getMessage() + "\n");
    }
}

