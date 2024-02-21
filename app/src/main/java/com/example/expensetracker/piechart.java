package com.example.expensetracker;

import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;
import android.os.Bundle;

import java.util.ArrayList;

public class piechart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart);

        getIntent();
        Bundle bundle = getIntent().getExtras();
        int expense = bundle.getInt("expense");
        int income = bundle.getInt("income");

        PieChart pieChart = findViewById(R.id.chart);

        ArrayList<PieEntry> entries=new ArrayList<>();
        entries.add(new PieEntry(expense,"expense"));
        entries.add(new PieEntry(income,"income"));

        PieDataSet pieDataSet=new PieDataSet(entries,"Money Manager");
        pieDataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        PieData pieData=new PieData(pieDataSet);

        pieChart.setData(pieData);
        pieChart.getDescription().setEnabled(false);
        pieChart.animateY(1000);
        pieChart.invalidate();
    }
}