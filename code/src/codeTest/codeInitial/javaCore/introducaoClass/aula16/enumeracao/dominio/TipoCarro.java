package codeTest.codeInitial.javaCore.introducaoClass.aula16.enumeracao.dominio;

public enum TipoCarro {
    ESPORTIVO(1){
        @Override
        public double litroKm(double litro) {
            return 3 * litro;
        }
    },
    CASUAL(2){
        @Override
        public double litroKm(double litro) {
            return 2 * litro;
        }
    },

    TRABALHO(3){
        @Override
        public double litroKm(double litro) {
            return 1 * litro;
        }
    };

    public final int VALOR;
    TipoCarro( int valor){
        this.VALOR = valor;
    }

    abstract public double litroKm(double litro);
}
