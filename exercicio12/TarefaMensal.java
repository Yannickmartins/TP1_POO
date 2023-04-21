package tpc5.exercicio12;

import java.time.LocalDate;

public class TarefaMensal extends tarefa {
    private final int diaDoMes;

    public TarefaMensal(String descricao, LocalDate data, int diaDoMes) {
        super(descricao, data);
        this.diaDoMes = diaDoMes;
    }

    @Override
    public boolean ocorreEm(int year, int month, int day) {
        LocalDate data = null;
        return data.getYear() == year && data.getMonthValue() == month && diaDoMes == day;
    }
}
