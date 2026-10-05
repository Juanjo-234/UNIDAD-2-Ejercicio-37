public class RedSolana implements RedBlockchain{
    private void validarWallet(String wallet) {

        if (wallet == null || wallet.length() < 32 || wallet.length() > 44) {
            throw new IllegalArgumentException("[Solana] Error: Dirección de wallet inválida. Longitud incorrecta para Base58.");
        }
    }

    @Override
    public double verificarSaldo(String direccionWallet) {
        validarWallet(direccionWallet);
        System.out.println("[Solana] Consultando la cuenta en el cluster de Solana: " + direccionWallet);
        return 345.50;
    }

    @Override
    public boolean ejecutarTransaccion(String origen, String destino, double monto) {
        validarWallet(origen);
        validarWallet(destino);
        if (monto <= 0) {
            throw new IllegalArgumentException("[Solana] El monto de la transacción debe ser mayor a cero.");
        }
        System.out.println("[Solana] Procesando transacción instantánea de " + monto + " SOL entre " + origen + " y " + destino);
        return true;
    }
}

