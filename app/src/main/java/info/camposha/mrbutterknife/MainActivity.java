package info.camposha.mrbutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.headerTextView) TextView headerTextView;
    @BindView(R.id.myProgressBar) ProgressBar myProgressBar;
    @BindView(R.id.nameEditText) EditText nameEditText;
    @BindView(R.id.imageView) ImageView myImageView;
    @BindView(R.id.greetBtn) Button sendBtn;
    @BindView(R.id.toggleBtn) Button toggleBtn;
    @BindString(R.string.header1) String headerText1;
    @BindString(R.string.header2) String headerText2;
    boolean showOriginal=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.greetBtn)
    public void greet(View view) {
        Toast.makeText(MainActivity.this, "Hello " + nameEditText.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    @OnClick(R.id.toggleBtn)
    public void toggle(View view) {
        if(showOriginal)
        {
            myImageView.setImageResource(R.drawable.oclemy);
            myProgressBar.setVisibility(View.GONE);
            headerTextView.setText(headerText1);
        }
        else{
            myImageView.setImageResource(R.drawable.cley);
            myProgressBar.setVisibility(View.VISIBLE);
            headerTextView.setText(headerText2);
        }
        showOriginal = !showOriginal;
    }
}
