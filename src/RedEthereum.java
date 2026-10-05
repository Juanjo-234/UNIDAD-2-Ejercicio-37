public class RedEthereum implements RedBlockchain{
    private void validarWallet(String wallet) {
        if (wallet == null || !wallet.startsWith("0x") || wallet.length() != 42) {
            throw new IllegalArgumentException("[Ethereum] Error: Dirección de wallet inválida. Debe comenzar con '0x' y tener 42 caracteres.");
        }
    }

    @Override
    public double verificarSaldo(String direccionWallet) {
        validarWallet(direccionWallet);
        System.out.println("Consultando balance en el Smart Contract para: " + direccionWallet);
        return 12.80;
    }

    @Override
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {
        validarWallet(origen);
        validarWallet(destino);
        if (monto <= 0) {
            throw new IllegalArgumentException("[Ethereum] El monto de la transacción debe ser mayor a cero.");
        }
        System.out.println("[Ethereum] Ejecutando gas y transfiriendo " + monto + " ETH de " + origen + " a " + destino);
        return true;
    };
}

