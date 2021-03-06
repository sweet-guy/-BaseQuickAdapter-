package com.wdcloud.recycleviewoftype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class OnlineWebView extends AppCompatActivity {
    private String realUrl="http://dl-al.wdcloud.cc/xptest1/M00/31/85/oYYBAFvimZaAGAM-AABJwljcTnM38.docx";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_web_view);
        WebView webView =findViewById(R.id.web);
        String finalUrl = "http://view.officeapps.live.com/op/view.aspx?src=" + realUrl + "";
        webView.loadUrl(finalUrl);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setAllowFileAccessFromFileURLs(true);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
    }
}
