package com.example.pdfreader;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public
class helper extends AppCompatActivity {
    PDFView pdfView;

    @Override
    protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper);
        pdfView = findViewById(R.id.pdfView);
        int chapter_position = getIntent().getIntExtra("key",0);
        if(chapter_position == 0){
            pdfView.fromAsset("one.pdf").load();

        } else if(chapter_position == 1){
            pdfView.fromAsset("one.pdf").load();

        }
        else if(chapter_position == 2){
            pdfView.fromAsset("two.pdf").load();

        } else if(chapter_position == 3){
            pdfView.fromAsset("three.pdf").load();

        } else if(chapter_position == 4){
            pdfView.fromAsset("four.pdf").load();

        } else if(chapter_position == 5){
            pdfView.fromAsset("five.pdf").load();

        } else if(chapter_position == 6){
            pdfView.fromAsset("six.pdf").load();

        } else if(chapter_position == 7){
            pdfView.fromAsset("seven.pdf").load();

        } else if(chapter_position == 8){
            pdfView.fromAsset("eight.pdf").load();

        }else if(chapter_position == 9){
            pdfView.fromAsset("nine.pdf").load();

        } else if(chapter_position == 10){
            pdfView.fromAsset("ten.pdf").load();

        }else if(chapter_position == 11){
            pdfView.fromAsset("eleven.pdf").load();

        }
    }
}