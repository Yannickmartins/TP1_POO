package tpc5.exercicio12;


import java.time.LocalDate;
import java.util.Date;

public class tarefa {
    private final String descricao;
    private final LocalDate data;

    public tarefa(String descricao, LocalDate data) {
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public boolean ocorreEm(int year, int month, int day) {
        return data.getYear() == year && data.getMonthValue() == month && data.getDayOfMonth() == day;
    }

    public void setDescricao(String descricao) {
    }

    public void setData(Date data) {
    }

    public boolean ocorreEm(Date data) {
        return false;
    }
}

