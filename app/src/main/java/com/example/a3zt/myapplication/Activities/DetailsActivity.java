package com.example.a3zt.myapplication.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.example.a3zt.myapplication.R;

public class DetailsActivity extends AppCompatActivity {
WebView webView;
String Name,Lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getFromIntent();
        webView=findViewById(R.id.web);
        webView.loadUrl("https://"+Lang+".wikipedia.org/wiki/"+Name+"");

        Log.d("AAAA","https://"+Lang+".wikipedia.org/wiki/"+Name+"");
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if (url.startsWith("https://"+Lang+".wikipedia.org/wiki/'"+Name+"'")) {
                    // magic
                    return true;
                }
                return false;
            }
        });
    }

    private void getFromIntent(){
        Bundle extras = getIntent().getExtras();
        if ((!extras.isEmpty())) {
            Name= extras.getString("Object");
            Lang= extras.getString("Lang");
        }
        else {
            Toast.makeText(this, "Object", Toast.LENGTH_SHORT).show();
        }
    }
}
