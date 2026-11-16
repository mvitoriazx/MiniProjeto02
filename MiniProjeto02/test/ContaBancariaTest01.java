package flamingo.apredendo.MiniProjeto02.test;

import flamingo.apredendo.MiniProjeto02.dominio.ContaBancaria;
    public class ContaBancariaTest01 {

        public static void main(String[] args) {

            // Criando duas contas
            ContaBancaria conta01 = new ContaBancaria();
            ContaBancaria conta02 = new ContaBancaria();

            // Cadastrando a primeira conta
            conta01.setTitular("Rafael");
            conta01.setNumeroConta(1001);

            // Cadastrando a segunda conta
            conta02.setTitular("Ana");
            conta02.setNumeroConta(1002);

            // Operações válidas
            conta01.depositar(1000);
            conta01.sacar(350);

            conta02.depositar(500);

            // Testando operações inválidas
            System.out.println("\n===== TESTANDO VALIDAÇÕES =====");

            conta01.depositar(-100);
            conta01.sacar(5000);

            conta02.depositar(0);
            conta02.sacar(-50);

            // Exibindo os dados das contas
            System.out.println("\n========== CONTA 01 ==========");
            conta01.exibirDados();

            System.out.println("\n========== CONTA 02 ==========");
            conta02.exibirDados();

            // Testando transferência
            System.out.println("\n===== TRANSFERÊNCIA BANCÁRIA =====");

            conta01.transferir(conta02, 150);

            System.out.println("\n========== APÓS TRANSFERÊNCIA ==========");

            System.out.println("\n========== CONTA 01 ==========");
            conta01.exibirDados();

            System.out.println("\n========== CONTA 02 ==========");
            conta02.exibirDados();

            // Teste de acesso direto ao saldo:
            // conta01.saldo = 999999;
            // Essa linha não compila porque saldo é private.
        }
    }
