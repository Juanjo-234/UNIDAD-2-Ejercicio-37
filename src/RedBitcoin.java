public class RedBitcoin implements  RedBlockchain{
    private void validarWallet(String wallet) {
        if (wallet == null || !(wallet.startsWith("1") || wallet.startsWith("3") || wallet.startsWith("bc1"))) {
            throw new IllegalArgumentException("[Bitcoin] Error: Dirección de wallet inválida. Debe iniciar con '1', '3' o 'bc1'.");
        }
    }
    @Override
    public double verificarSaldo(String direccionWallet) {
        System.out.println(" Consultando el árbol UTXO para la wallet: " + direccionWallet);
        return 1.45;
    }

    @Override
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {
        validarWallet(origen);
        validarWallet(destino);
        if (monto <= 0) {
            throw new IllegalArgumentException("[Bitcoin] El monto de la transacción debe ser mayor a cero.");
        }
        System.out.println("[Bitcoin] Minando transacción de " + monto + " BTC desde " + origen + " hacia " + destino);
        return true;
    }
}
