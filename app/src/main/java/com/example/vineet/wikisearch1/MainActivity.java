package com.example.vineet.wikisearch1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button1;
    EditText editText1;
    WebView webView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1=(EditText)findViewById(R.id.editText1);
        button1=(Button)findViewById(R.id.button1);
        webView1=(WebView)findViewById(R.id.webView1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView1.setWebViewClient(new WebViewClient());

                webView1.loadUrl("http://en.wikipedia.org/w/index.php?search="+editText1.getText().toString());
            }
        });

        class WebClient extends WebViewClient {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        }



    }
}
