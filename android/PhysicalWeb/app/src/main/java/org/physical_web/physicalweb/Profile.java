package org.physical_web.physicalweb;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
/*import org.physical_web.collection.PhysicalWebCollection;
import org.physical_web.collection.PwPair;
import org.physical_web.collection.PwsResult;
import org.physical_web.collection.UrlDevice;*/


public class Profile extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

            //String i = "http://omega.uta.edu/~ckr5036/yonghe.html";

     Bundle bundle = getIntent().getExtras();
        String i = bundle.getString("i");
        if(i.equalsIgnoreCase("104")) {
            String z = "http://omega.uta.edu/~ckr5036/yonghe.html";
            WebView mWebView = (WebView) findViewById(R.id.webView);
            mWebView.loadUrl(z);
        }
        if(i.equalsIgnoreCase("001")) {
            String z = "http://omega.uta.edu/~ckr5036/ding.html";
            WebView mWebView = (WebView) findViewById(R.id.webView);
            mWebView.loadUrl(z);
        }

        if(i.equalsIgnoreCase("002")) {
            String z = "http://omega.uta.edu/~ckr5036/li.html";
            WebView mWebView = (WebView) findViewById(R.id.webView);
            mWebView.loadUrl(z);
        }

        if(i.equalsIgnoreCase("003")){
            String z = "http://omega.uta.edu/~ckr5036/huang.html";
            WebView mWebView = (WebView) findViewById(R.id.webView);
            mWebView.loadUrl(z);
        }
        if(i.equalsIgnoreCase("010")){
            String z = "http://omega.uta.edu/~ckr5036/yu.html";
            WebView mWebView = (WebView) findViewById(R.id.webView);
            mWebView.loadUrl(z);
        }

        if(i.equalsIgnoreCase("005")) {
            String z = "http://omega.uta.edu/~ckr5036/hao.html";
            WebView mWebView = (WebView) findViewById(R.id.webView);
            mWebView.loadUrl(z);
        }
        if(i.equalsIgnoreCase("006")) {
            String z = "http://omega.uta.edu/~ckr5036/song.html";
            WebView mWebView = (WebView) findViewById(R.id.webView);
            mWebView.loadUrl(z);
        }



        if(i.equalsIgnoreCase("009")) {
            String z = "http://omega.uta.edu/~ckr5036/jia.html";
            WebView mWebView = (WebView) findViewById(R.id.webView);
            mWebView.loadUrl(z);
        }







    }
}
