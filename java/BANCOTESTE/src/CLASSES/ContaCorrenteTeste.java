package CLASSES;

public class ContaCorrenteTeste extends ContaTeste{
    private int contadorTalao;

    public ContaCorrenteTeste () {

    }

    public int getContadorTalao() {
        return contadorTalao;
    }

    public void setContadorTalao(int contadorTalao) {
        this.contadorTalao = contadorTalao;
    }

    public void pedeTalao() {
        if (this.getContadorTalao() < 3) {
            this.setContadorTalao(this.getContadorTalao()+1);

            System.out.println("Tal�o de cheque solicitado");

        } else { 
            System.out.println("Voc� atingiu o limite mensal.");
        }
    }

}