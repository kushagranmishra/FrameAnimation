package kushagra.digipodium.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = findViewById(R.id.button);
        ImageView cat=findViewById(R.id.imageView);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageView cat=findViewById(R.id.imageView);
                cat.setImageResource(R.drawable.runningcat);
                AnimationDrawable runningCat=(AnimationDrawable)cat.getDrawable();
                runningCat.start();
            }
        });
    }
}
