package com.example.eshoboiporiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;

public class PdfActivity extends AppCompatActivity {

    PDFView pdfView;
    TextView ChapName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        getSupportActionBar().hide();
        pdfView=findViewById(R.id.pdfView);
        ChapName=findViewById(R.id.ChapNames);

        int position= getIntent().getIntExtra("position",0);
        String chapter=getIntent().getStringExtra("name");

        if(position==0)
        {
            pdfView.fromAsset("Deyal by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }
        else if (position==1) {

            pdfView.fromAsset("Ei Boshonte by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }
        else if (position==2) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==3) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==4) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==5) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==6) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==7) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==8) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==9) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==10) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==11) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }else if (position==12) {

            pdfView.fromAsset("Nobiji by Humayun Ahmed.pdf").load();
            ChapName.setText(chapter);
        }

    }
}