package functions;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (estaCorreto(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            throw new RuntimeException("Data incorreta");
        }
    }

    public Data() {
        definirComoHoje();
    }

    public int getAno() // Gabriel
    {
        return ano;
    }

    public static boolean estaCorreto(int dia, int mes, int ano) {
        boolean ok = false;
        int udm = 0;
        if (ano >= 1582) {
            if (mes >= 1 && mes <= 12) {
                if (mes == 2 && ano % 4 == 0) {
                    udm = 29;
                } else {
                    udm = 28;
                }
                if (mes == 1 && mes == 3 && mes == 5 && mes == 7 && mes == 8 && mes == 10 && mes == 12) {
                    udm = 31;
                } else if (mes == 4 && mes == 6 && mes == 9 && mes == 11) {
                    udm = 30;
                }
                if (dia >= 1 && dia <= udm) {
                    ok = true;
                }
            }
        }
        return ok;
    }

    public void setDia(int a) // Gabriel
    {
        if (estaCorreto(a, this.mes, this.ano)) {
            this.dia = a;
        }
    }

    public void setMes(int mes) // Gabriel
    {
        if (estaCorreto(this.dia, mes, this.ano)) {
            this.mes = mes;
        }
    }

    public void setAno(int ano) // Gabriel
    {
        if (estaCorreto(this.dia, this.mes, ano)) {
            this.ano = ano;
        }
    }

    public int getDia() // Gabriel
    {
        return dia;
    }

    public int getMes() // Gabriel
    {
        return mes;
    }

    public void aumentarAno() // Arthur
    {
        this.ano++;
        if (!estaCorreto(this.dia, this.mes, this.ano)) {
            this.dia = 28;
        }
    }

    public void retrocederAno() // Nicolas
    {
        if (ano > 1582) {
            this.ano--;
            if (!estaCorreto(this.dia, this.mes, this.ano)) {
                this.dia = 28;
            }
        }
    }

    public String getDiaDaSemana() // Jonatan
    {
        //int dsemana = ((this.dia + 2 * this.mes) + ((3 * (this.mes + 1)) / 5) + this.ano + (this.ano / 4) - (this.ano / 100) + (this.ano / 400) + 2) % 7;
        int dsemana = this.getDiaDoSeculo() % 7;
        String[] diadasemana
                = {
                    "Domingo", "Segunda", "Terça", "Quarta", "Quinta",
                    "Sexta", "Sabado"
                };
        return (diadasemana[dsemana - 1]);
    }

    // sequencial
    public int getDiaDoAno() // Jalis
    {
        GregorianCalendar gc = new GregorianCalendar();
        int x = gc.get(Calendar.DAY_OF_YEAR);
        return x;
    }

    public int obterDiferenca(Data dt) // João Hickmann
    {
        return Math.abs(dt.getDiaDoSeculo() - this.getDiaDoSeculo());
        //return Math.abs(getDiasDesdeAnoZero(dt) - getDiasDesdeAnoZero(this));
    }

    /*
    public int getDiasDesdeAnoZero(Data dt) // João Hickmann
    {
        int[] diasMes =
        {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        diasMes[1] = dt.ano % 400 == 0 || (dt.ano % 4 == 0 && dt.ano % 100 != 0) ? 29 : 28;
        int dias = dt.dia + (dt.ano - 1) * 365 + (int) (dt.ano - 1) / 4
                - (int) (dt.ano - 1) / 100 + (int) (dt.ano - 1) / 400;
        for (int mes = 0; mes < dt.mes - 1; mes++)
        {
            dias += diasMes[mes];
        }
        return dias;
    }
     */
    public boolean isFeriado() // Lucas
    {
        boolean ok = false;
        Data dtUniversal = new Data(01, 1, ano);
        Data dtTiradentes = new Data(21, 4, ano);
        Data dtTrabalhador = new Data(01, 5, ano);
        Data dtPatria = new Data(07, 9, ano);
        Data dtNossaSenhora = new Data(12, 10, ano);
        Data dtFinados = new Data(02, 11, ano);
        Data dtProclaRepublica = new Data(15, 11, ano);
        Data dtNatal = new Data(25, 12, ano);

        if (this.equals(dtUniversal)
                || this.equals(dtTiradentes)
                || this.equals(dtTrabalhador)
                || this.equals(dtPatria)
                || this.equals(dtNossaSenhora)
                || this.equals(dtFinados)
                || this.equals(dtProclaRepublica)
                || this.equals(dtNatal)) {
            ok = true;

        }
        return ok;
    }

    public String getEstacao() // Carlos
    {
        String est = "";

        Data dtIniPrimavera = new Data(21, 9, ano);
        Data dtFimPrimavera = new Data(20, 12, ano);

        Data dtIniVerao = new Data(21, 12, ano);
        Data dtFimVerao = new Data(20, 3, ano);

        Data dtIniOutono = new Data(21, 3, ano);
        Data dtFimOutono = new Data(20, 6, ano);

        Data dtIniInverno = new Data(21, 6, ano);
        Data dtFimInverno = new Data(20, 9, ano);

        if (this.compareTo(dtIniPrimavera) >= 0 && this.compareTo(dtFimPrimavera) <= 0) {
            est = "primavera";
        }
        if (this.compareTo(dtIniVerao) >= 0 && this.compareTo(dtFimVerao) <= 0) {
            est = "verao";
        }
        if (this.compareTo(dtIniOutono) >= 0 && this.compareTo(dtFimOutono) <= 0) {
            est = "outono";
        }
        if (this.compareTo(dtIniInverno) >= 0 && this.compareTo(dtFimInverno) <= 0) {
            est = "inverno";
        }
        return est;
    }

    public String getExtensoDoMes() // Leonardo
    {

        String nomeMes = "";

        if (mes == 1) {
            nomeMes = "janeiro";
        } else {
            if (mes == 2) {
                nomeMes = "fevereiro";
            } else {
                if (mes == 3) {
                    nomeMes = "março";
                } else {
                    if (mes == 4) {
                        nomeMes = "abril";
                    } else {
                        if (mes == 5) {
                            nomeMes = "maio";
                        } else {
                            if (mes == 6) {
                                nomeMes = "junho";
                            } else {
                                if (mes == 7) {
                                    nomeMes = "julho";
                                } else {
                                    if (mes == 8) {
                                        nomeMes = "agosto";
                                    } else {
                                        if (mes == 9) {
                                            nomeMes = "setembro";
                                        } else {
                                            if (mes == 10) {
                                                nomeMes = "outubro";
                                            } else {
                                                if (mes == 11) {
                                                    nomeMes = "novembro";
                                                } else {
                                                    if (mes == 12) {
                                                        nomeMes = "dezembro";
                                                    }
                                                }

                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return nomeMes;
    }

    public boolean isBissexto() // Bruno
    {
        boolean isValid = false;
        if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
            isValid = true;
        }
        return isValid;
    }

    public void avancarUmDia() // Vuadem
    {
        dia++;
        if (!estaCorreto(dia, mes, ano)) {
            dia = 1;
            mes++;
            if (!estaCorreto(dia, mes, ano)) {
                mes = 1;
                ano++;
            }
        }
    }

    public void retrocederUmDia() // Wesley
    {
        int[] udm
                = {
                    31, 28, 31, 30, 31,
                    30, 31, 31, 30, 31, 30, 31
                };
        if (isBissexto()) {
            udm[1] = 29;
        }
        dia--;
        if (!estaCorreto(dia, mes, ano) && mes == 1) {
            dia = 31;
            ano--;
        } else if (!estaCorreto(dia, mes, ano)) {
            mes--;
            dia = udm[mes - 1];
        }
    }

    public String getFaseDaLua() // Citolin
    {
        return "";
    }

    public boolean isHorarioVerao() // De Almeida
    {
        boolean summerTime = false;
        int r = 0, p = 0;
        Data dtHoraVeraoInicio = new Data(1, 11, this.ano);
        Data dtHoraVeraoFim = new Data(15, 2, this.ano + 1);
        for (int x = 0; x < 7; x++) {
            if (!(dtHoraVeraoInicio.getDiaDaSemana()).equals("Domingo")) {
                dtHoraVeraoInicio.avancarUmDia();
            }
        }
        for (int x = 0; dia < 7; dia++) {
            if (!(dtHoraVeraoFim.getDiaDaSemana()).equals("Domingo")) {
                dtHoraVeraoFim.avancarUmDia();
            }
        }
        if (this.compareTo(dtHoraVeraoInicio) >= 0 && this.compareTo(dtHoraVeraoFim) <= 0) {
            summerTime = true;
        }
        return summerTime;
    }

    public void avancarDias(int dias) //Ariel
    {
        for (int i = 0; i < dias; i++) {
            avancarUmDia();
        }
    }

    public void retrocederDias(int dias) // Geraldo
    {
        for (int i = 0; i < dias; i++) {
            retrocederUmDia();
        }
    }

    public double percentualDoAno() // Peiter
    {
        //Data data = new Data(this.dia, this.mes, this.ano);
        //Data dataInicioAno = new Data(01, 01, this.ano);

        int diasAno = 365;
        if (this.mes == 2) {
            if (this.ano % 400 == 0 || (this.ano % 4 == 0 && this.ano % 100 != 0)) {
                diasAno = 366;
            }
        }

        //int diaSecData = this.getDiaDoSeculo();
        //int diaSecDataInicioAno = dataInicioAno.getDiaDoSeculo();
        //int diaDoAno = (diaSecData - diaSecDataInicioAno);
        int diaDoAno = this.getDiaDoAno();

        double percent = (diaDoAno * 100.0f) / diasAno;

        return percent;
    }

    public int getSeculo() //Patrick
    {
        String date;
        String datefim;
        String dateini;
        int seculo;
        date = Integer.toString(this.ano);
        datefim = date.substring(2);
        dateini = date.substring(0, 2);
        if (datefim.equals("00")) {
            seculo = Integer.parseInt(dateini);
            return seculo;
        } else {
            seculo = Integer.parseInt(dateini);
            seculo = seculo + 1;
            return seculo;
        }
    }

    public Data getDataFutura(int dias) {
        Data data = new Data(this.dia, this.mes, this.ano);
        data.avancarDias(dias);
        return data;
    }

    public String obterDataFormatada() {
        return ano + "-" + mes + "-" + dia;
    }

    public String obterDataExtenso() {
        return "";
    }

    public int compareTo(Data dt) {
        int r = 0;
        if (this.getDiaDoSeculo() < dt.getDiaDoSeculo()) {
            r = -1;
        } else if (this.getDiaDoSeculo() > dt.getDiaDoSeculo()) {
            r = 1;
        }
        return r;
    }

    public int getDiaDoSeculo() {
        int diaDoSeculo = (ano - 1901) * 365 + (ano - 1901) / 4 + dia + (mes - 1)
                * 31 - ((mes * 4 + 23) / 10)
                * ((mes + 12) / 15) + ((4 - ano % 4) / 4)
                * ((mes + 12) / 15);
        return diaDoSeculo;
    }

    public boolean equals(Data dt) {
        if (this.dia == dt.dia && this.mes == dt.mes && this.ano == dt.ano) {
            return true;
        }

        return false;
    }

    public double getFaseLunar() {
        int somaDias = this.getDiaDoAno();
        int fasesLua = (int) Math.floor((somaDias % 29.4) / 3.7);

        return fasesLua;
    }

    public int ultimoDiaMes(int mesAtual) {
        int udm = 0;
        if (mesAtual == 2) {
            udm = 28;
        }
        if (mesAtual == 2 && ano % 4 == 0) {
            udm = 29;
        }
        if (mesAtual == 4 || mesAtual == 6 || mesAtual == 9 || mesAtual == 11) {
            udm = 31;
        }
        if (mesAtual == 1 || mesAtual == 3 || mesAtual == 5 || mesAtual == 7 || mesAtual == 8 || mesAtual == 10 || mesAtual == 12) {
            udm = 30;
        }
        return udm;
    }

    public void definirComoHoje() {
        Calendar c = Calendar.getInstance();
        this.dia = c.get(Calendar.DAY_OF_MONTH);
        this.mes = c.get(Calendar.MONTH) + 1;
        this.ano = c.get(Calendar.YEAR);
    }

}
