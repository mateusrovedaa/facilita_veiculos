package functions;

import static java.lang.Math.round;
import java.text.DecimalFormat;
import java.util.ArrayList;



public class Parcelas {

    public ArrayList<Double> calculaParcelas(double valor, int parcelas) {
        double valorParcela = 0;
        double[] totalParcelas = new double[parcelas];
        ArrayList<Double> x = new ArrayList();

        for (int i = 0; i < parcelas - 1; i++) {
            valorParcela = round(valor / parcelas);
            totalParcelas[i] = valorParcela;
        }

        double ultimaParcela = valor - (valorParcela * (parcelas - 1));
        totalParcelas[parcelas - 1] = ultimaParcela;

        for (int i = 0; i < parcelas; i++) {
            x.add(totalParcelas[i]);
        }

        return x;
    }

    public DecimalFormat df2 = new DecimalFormat("#.##");

}
