package flamingo.apredendo.MiniProjeto02.dominio;
       public class ContaBancaria {

        // Atributos privados (encapsulamento)
        private String titular;
        private int numeroConta;
        private double saldo;

        // Setter do titular
        public void setTitular(String titular) {
            if (titular != null && !titular.trim().isEmpty()) {
                this.titular = titular;
            } else {
                System.out.println("Erro: Nome do titular inválido!");
            }
        }

        // Setter do número da conta
        public void setNumeroConta(int numeroConta) {
            if (numeroConta > 0) {
                this.numeroConta = numeroConta;
            } else {
                System.out.println("Erro: Número da conta inválido!");
            }
        }

        // Getters
        public String getTitular() {
            return this.titular;
        }

        public int getNumeroConta() {
            return this.numeroConta;
        }

        public double getSaldo() {
            return this.saldo;
        }

        // Método depositar
        public void depositar(double valor) {

            if (Double.isFinite(valor) && valor > 0) {
                this.saldo += valor;
                System.out.println("Depósito realizado com sucesso!");
            } else {
                System.out.println("Erro: Valor de depósito inválido!");
            }
        }

        // Método sacar
        public void sacar(double valor) {

            if (!Double.isFinite(valor) || valor <= 0) {
                System.out.println("Erro: Valor de saque inválido!");

            } else if (valor > this.saldo) {
                System.out.println("Erro: Saldo insuficiente!");

            } else {
                this.saldo -= valor;
                System.out.println("Saque realizado com sucesso!");
            }
        }

        // Método exibir dados
        public void exibirDados() {

            System.out.println("Titular: " + this.titular);
            System.out.println("Número da conta: " + this.numeroConta);
            System.out.printf("Saldo: R$ %.2f%n", this.saldo);
        }

        // Desafio extra: transferência bancária
        public void transferir(ContaBancaria destino, double valor) {

            if (destino == null) {
                System.out.println("Erro: Conta de destino inválida!");
                return;
            }

            if (!Double.isFinite(valor) || valor <= 0) {
                System.out.println("Erro: Valor de transferência inválido!");
                return;
            }

            if (valor > this.saldo) {
                System.out.println("Erro: Saldo insuficiente!");
                return;
            }

            // Realiza a transferência
            this.saldo -= valor;
            destino.saldo += valor;

            System.out.println("Transferência realizada com sucesso!");
        }
    }
