package ge.tbc.multichannel.multichanneltest;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.HandlerThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ProgressBar myProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.server_downtime_layout);

        ImageView imageBig = findViewById(R.id.image_big);
        ImageView imageMedium = findViewById(R.id.image_medium);
        ImageView imageSmall = findViewById(R.id.image_small);


        RotateAnimation anim1 = new RotateAnimation(0.0f, 360.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim1.setInterpolator(new LinearInterpolator());
        anim1.setRepeatCount(Animation.INFINITE);
        anim1.setDuration(8000);

        imageBig.setAnimation(anim1);

        RotateAnimation anim2 = new RotateAnimation(0.0f, 360.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim2.setInterpolator(new LinearInterpolator());
        anim2.setRepeatCount(Animation.INFINITE);
        anim2.setDuration(6000);

        imageMedium.setAnimation(anim2);

        RotateAnimation anim3 = new RotateAnimation(0.0f, 360.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        anim3.setInterpolator(new LinearInterpolator());
        anim3.setRepeatCount(Animation.INFINITE);
        anim3.setDuration(1000);

        imageSmall.setAnimation(anim3);


        myProgress = findViewById(R.id.progressBar);

    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.text_tryAgain){
            view.setVisibility(View.GONE);
            myProgress.setVisibility(View.VISIBLE);


//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            view.setVisibility(View.VISIBLE);
        }
    }
}
