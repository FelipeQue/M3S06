package br.senai.lab365.exercicio02;

public class Main {
    public static void main(String[] args) {

        System.out.println(getDipirona().getBula());

    }

    public static Medicamento getDipirona() {
        return new MedicamentoBuilder()
                .setNome("Dipirona Sódica 500mg")
                .setDosagem(500)
                .setUnidadeDosagem("mg")
                .setNomeLaboratorio("EMS")
                .setBula(new StringBuilder()
                        .append("Para que serve Dipirona Sódica?\n")
                        .append("Como a Dipirona Sódica tem ação analgésica e antipirética, ela serve para aliviar dores e também reduzir a febre no paciente. ")
                        .append("Além disso, é importante ressaltar que o remédio é bastante indicado para dor com intensidade leve e moderada.\n")
                        .append("Esse remédio também serve para tratar dores de dentes, além de cólicas menstruais e outras condições. ")
                        .append("Por ser acessível, ele pode ser encontrado nas mais diferentes redes de farmácias.\n")
                        .toString())
                .build();
    }


}
