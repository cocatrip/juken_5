package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import java.util.ArrayList;
import java.util.List;

public class LineData extends BarLineScatterCandleBubbleData<ILineDataSet> {
    public LineData() {
    }

    public LineData(List<String> xVals) {
        super(xVals);
    }

    public LineData(String[] xVals) {
        super(xVals);
    }

    public LineData(List<String> xVals, List<ILineDataSet> dataSets) {
        super(xVals, dataSets);
    }

    public LineData(String[] xVals, List<ILineDataSet> dataSets) {
        super(xVals, dataSets);
    }

    public LineData(List<String> xVals, ILineDataSet dataSet) {
        super(xVals, toList(dataSet));
    }

    public LineData(String[] xVals, ILineDataSet dataSet) {
        super(xVals, toList(dataSet));
    }

    private static List<ILineDataSet> toList(ILineDataSet dataSet) {
        List<ILineDataSet> sets = new ArrayList<>();
        sets.add(dataSet);
        return sets;
    }
}
