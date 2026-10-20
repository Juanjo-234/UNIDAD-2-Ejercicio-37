Este programa está diseñado para modelar y gestionar operaciones financieras y consultas de saldos en múltiples redes de criptomonedas (como Bitcoin, Ethereum y Solana) de forma transparente e intercambiable, utilizando polimorfismo, una interfaz común blockchain y validaciones de formato de direcciones de billetera mediante programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la interfaz RedBlockchain: Establece el contrato modular estándar que cualquier ecosistema criptográfico debe cumplir, declarando los métodos abstractos fundamentales: verificarSaldo(String direccionWallet) y boolean ejecutarTransaccion(String origen, String destino, double monto), además de un método para identificar la red.

Implementa clases concretas (RedBitcoin, RedEthereum, RedSolana): Heredan y ejecutan la interfaz adaptando la lógica operativa a los estándares de cada red (como sistemas UTXO y firmas digitales en Bitcoin, máquinas virtuales y Gas Fees en Ethereum, o procesamiento de alta velocidad Proof-of-History en Solana).

Incorpora validaciones de formato de wallet: Cada clase concreta implementa sus propias reglas de validación criptográfica y estructural (por ejemplo, Bitcoin verifica prefijos como 1, 3 o bc1 y longitud mínima; Ethereum exige el prefijo 0x exacto y 42 caracteres hexadecimales; Solana valida longitudes estándar de direcciones Base58).

Ejecuta la prueba polimórfica (main): Utiliza una única variable de tipo interfaz (RedBlockchain redActual) para alternar e interactuar de forma dinámica con distintas redes tecnológicas, simulando transacciones válidas, controlando rechazos por formatos incorrectos y mostrando el flujo de confirmación por consola.
