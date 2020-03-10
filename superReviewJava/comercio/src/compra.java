public class compra {
    int valorTotal;
    int parcelas;

    //a vista
    public Compra(int valor){
        valorTotal = valor;
        parcelas = 1;
    }

    //parcelado
    public Parcelado(int qtdParcela, int valorParcela){
        parcelas = qtdParcela;
        valorTotal = valorParcela* qtdParcela;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getParcelas() {
        return parcelas;
    }

    public int getValorParcela(){
        return valorTotal/parcelas;
    }
}

