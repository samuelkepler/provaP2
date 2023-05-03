
import java.util.Scanner;

public class BancoPessoa {

    String nome;
    float cpf;
    float rg;
    int contaCorrente;
    int agencia;
    float saldo;

    public BancoPessoa(
            String nome,
            float cpf,
            float rg,
            int contaCorrente,
            int agencia,
            float saldo) {

        this.nome = nome;
        this.cpf = 0;
        this.rg = 0;
        this.contaCorrente = 2;
        this.agencia = 1;
        this.saldo = 100;
    }

    Scanner lerResposta = new Scanner(System.in);

    String imprimir() {

        String confImpressao;

        System.out.println(" olá você quer imprimir o seu Saldo Bancario? ( sim / não )");
        confImpressao = lerResposta.nextLine();

        if (confImpressao.equals("sim")) {

            System.out.println(" Seu saldo bancario é de R$ " + this.saldo);
        } else if (confImpressao.equals("não")) {

        }

        lerResposta.close();

        return imprimir();

    }

    double transfBancaria() {

        String confTransf; float envio; float transfPessoa; float novoSaldo;

        System.out.println(" você deseja efetuar uma tranferencia bancaria ? ( sim / não )");
        confTransf = lerResposta.nextLine();

        if (confTransf.equals("sim")) {

            if (this.saldo == 0) {

                System.out.println(
                        " Seu saldo é insufiente você não pode efetuar nenhum tranferencia bancaria, seu saldo é de"
                                + this.saldo);

            } else if (this.saldo > 0)

                System.out.println(" De qual valor será a sua transferência ?");

            {

                confTransf = lerResposta.nextLine();
                envio = Float.parseFloat(confTransf);

                if (envio > this.saldo) {

                    System.out.println("você não tem esse valor");

                } else if (envio <= this.saldo) {

                    System.out.println(" Digite o CPF de você quem deseja enviar ?");
                    confTransf = lerResposta.nextLine();
                    transfPessoa = Float.parseFloat(confTransf);

                    if (transfPessoa == this.cpf) {

                        novoSaldo = this.saldo + envio;

                        System.out.println(" seu novo saldo é de " + this.saldo);

                    }

                }

            }
        }
        lerResposta.close();
        return transfBancaria();
    }

}