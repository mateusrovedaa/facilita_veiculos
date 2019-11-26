/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author Mateus Roveda <mateus.roveda - Roveeb>
 */
public class GeradorDeGrafico {

    public GeradorDeGrafico() {
    }

    private static JPanel pizza3D(ArrayList nome, ArrayList valor, String tituloGrafico, float transparencia, String tipo) {
        DefaultPieDataset data = new DefaultPieDataset();

        for (int i = 0; i < nome.toArray().length; i++) {
            data.setValue("" + nome.get(i).toString(),
                    new Double(valor.get(i).toString()));
        }

        JFreeChart chart = ChartFactory.createPieChart(tituloGrafico, data, true, true, true);

        java.awt.Color cor = new java.awt.Color(200, 200, 200);
        chart.setBackgroundPaint(cor);
        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setLabelLinksVisible(true);
        plot.setNoDataMessage("Não existem dados para serem exibidos no gráfico");

        plot.setStartAngle(90);
        plot.setDirection(Rotation.CLOCKWISE);

        plot.setForegroundAlpha(transparencia);
        plot.setInteriorGap(0.20);

        ChartPanel chartPanel = new ChartPanel(chart);

        return chartPanel;
    }

    public static JPanel pizza3DStatic(ArrayList nome, ArrayList valor, String tituloGrafico) {
        return pizza3D(nome, valor, tituloGrafico, 0.5f, "Static");
    }
}
