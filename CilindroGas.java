public class CilindroGas {
    private int idCilindro;
    private float capacidadeMaxima;
    private float capacidadeAtual;
    private float qtdeUltimoConsumo ;

    // constructor serve pra os atributos iniciarem com valor setados.
    public CilindroGas (int idCilindro, float capacidadeMaxima) {
        this.qtdeUltimoConsumo = 0; // nao precisa colocar no parâmetro pq
        this.idCilindro = idCilindro;
        this.capacidadeMaxima = capacidadeMaxima;
        this.capacidadeAtual = capacidadeMaxima;
    }

    public int getIdCilindro() {
        return this.idCilindro;
    }

    public float getCapacidadeMaxima() {
        return this.capacidadeMaxima;
    }

    public float getCapacidadeAtual() {
        return this.capacidadeAtual;
    }

    public float getQtdeUltimoConsumo() {
        return this.qtdeUltimoConsumo;
    }

    public void setIdCilindro(int idCilindro) {
        this.idCilindro = idCilindro;
    }

    public void setCapacidadeMaxima(float capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public boolean registrarConsumo (float qtde) {

        float consumo = this.capacidadeAtual - qtde;
        if (consumo >= 0) {
            this.capacidadeAtual = consumo;
            this.qtdeUltimoConsumo = qtde;
            return true;
        } else {
            return false;
        }
    }
}
