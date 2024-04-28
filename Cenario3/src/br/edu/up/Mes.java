package br.edu.up;

public class Mes {
    private int mes;
    private int qntDias;

    public Mes(int mes, int qntDias) {
        this.mes = mes;
        this.qntDias = qntDias;
    }
    
    Ano ano = new Ano(mes, false);
    public String getNomeMes() {
    String nomeMes = "";
        switch (mes) {
            case 1:
            nomeMes = "Janeiro";
            qntDias = 31;
                break;
        
            case 2:
            nomeMes = "Fevereiro";
            qntDias = 28;
            if (ano.ehBissexto(mes) == true) {
                qntDias = 29;
            }
                break;

            case 3:
            nomeMes = "Março";
            qntDias = 31;
                break;

            case 4:
            nomeMes = "Abril";
            qntDias = 30;
                break;

            case 5:
            nomeMes = "Maio";
            qntDias = 31;
                break;

            case 6:
            nomeMes = "Junho";
            qntDias = 30;
                break;

            case 7:
            nomeMes = "Julho";
            qntDias = 31;
                break;

            case 8:
            nomeMes = "Agosto";
            qntDias = 31;
                break;

            case 9:
            nomeMes = "Setembro";
            qntDias = 30;
                break;

            case 10:
            nomeMes = "Outubro";
            qntDias = 31;
                break;

            case 11:
            nomeMes = "Novembro";
            qntDias = 30;
                break;

            case 12:
            nomeMes = "Dezembro";
            qntDias = 31;
                break;
            default:
            nomeMes = "Mês inválido";
                break;
        }
        return nomeMes;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getQntDias() {
        return qntDias;
    }
    
    public void setQntDias(int qntDias) {
        this.qntDias = qntDias;
    }
}
