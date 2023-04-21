package tpc5.exercicio11;


public class veiculo {
        private final String placa;
        private final String marca;
        private final int anoFabricacao;
        private double valor;

        public  veiculo(String placa, String marca, int anoFabricacao, double valor) {
            this.placa = placa;
            this.marca = marca;
            this.anoFabricacao = anoFabricacao;
            this.valor = valor;
        }

    public veiculo(String placa, String marca, int anoFabricacao) {

        this.placa = placa;
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
    }


    public String getPlaca() {
            return placa;
        }

        public String getMarca() {
            return marca;
        }

        public int getAnoFabricacao() {
            return anoFabricacao;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }

        public int calcularIdade(int anoAtual) {
            return anoAtual - anoFabricacao;
        }
    }



