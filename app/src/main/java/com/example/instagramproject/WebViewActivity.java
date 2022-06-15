package com.example.instagramproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.squareup.picasso.Picasso;

public class WebViewActivity extends AppCompatActivity {

    //    https://www.rnwmultimedia.com/
    ImageLoader imageLoader;
    ImageView img;
    DisplayImageOptions options;
    WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);


        imageLoader = ImageLoader.getInstance();
        imageLoader.init(ImageLoaderConfiguration.createDefault(getApplicationContext()));


        initView();
    }

    private void initView() {

        img = findViewById(R.id.img);


        String imageUri = "https://www.geeksforgeeks.org/wp-content/uploads/gfg_200X200-1.png";

        // with below method we are setting display option for our image..
        options = new DisplayImageOptions.Builder()

                // stub image will display when your image is loading
                .showStubImage(R.drawable.ic_launcher_foreground)

                // below image will be displayed when the image url is empty
                .showImageForEmptyUri(R.drawable.ic_launcher_background)

                // cachememory method will caches the image in users external storage
                .cacheInMemory()

                // cache on disc will caches the image in users internal storage
                .cacheOnDisc()

                // build will build the view for displaying image..
                .build();
        // below method will display image inside our image view..
        imageLoader.displayImage(imageUri, img, options, null);


//        Glide.with(this).load("http://goo.gl/gEgYUd").centerCrop().placeholder(R.drawable.ic_launcher_background).into(img);
//
//        Picasso.get()
//                .load("http://goo.gl/gEgYUd")
//                .into(img);


//        webview=findViewById(R.id.webview);
//
//
//
//        webview.loadUrl("https://www.rnwmultimedia.com/");
    }
}