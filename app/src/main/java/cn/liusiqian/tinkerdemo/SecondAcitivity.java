package cn.liusiqian.tinkerdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Créé par liusiqian 2016/12/7.
 */

public class SecondAcitivity extends Activity
{
    private Button btn;
    private TextView tvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvInfo = (TextView) findViewById(R.id.txt_info);
        btn = (Button) findViewById(R.id.btn_test);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                onClickBtnTest();
            }
        });
    }

    private void onClickBtnTest()
    {
        Toast.makeText(this,"测试",Toast.LENGTH_SHORT).show();
    }
}
