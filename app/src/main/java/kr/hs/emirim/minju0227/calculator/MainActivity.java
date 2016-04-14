package kr.hs.emirim.minju0227.calculator;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity implements View.OnClickListener {

    Button butPlus, butMinus, butmultiply, butDivide;
    EditText editNum1, editNum2;
    TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // xml 문서에 있는 모든 요소가 적재됨
        setContentView(R.layout.activity_main);

        // 참조 변수
        butPlus = (Button)findViewById(R.id.but_plus);
        butMinus = (Button)findViewById(R.id.but_minus);
        butmultiply = (Button)findViewById(R.id.but_multiply);
        butDivide = (Button)findViewById(R.id.but_divide);

        editNum1 = (EditText)findViewById(R.id.edit_num1);
        editNum2 = (EditText)findViewById(R.id.edit_num2);

        textResult = (TextView)findViewById(R.id.text_result);

        butPlus.setOnClickListener(this);
        butMinus.setOnClickListener(this);
        butDivide.setOnClickListener(this);
        butmultiply.setOnClickListener(this);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */

    @Override // 'onClick' handler class is abstract method
    public void onClick(View v) {

        // 2개의 EditText 에 입력된 값을 반환 받는다.
        String num1Str = editNum1.getText().toString();
        String num2Str = editNum2.getText().toString();

        // 정수로 형변환
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        double result=0;

        // 이벤트가 발생한 객체에 대한 정보를 v 가 가지고 있다.
        switch(v.getId()) {

            case R.id.but_plus:
                result = num1+num2; break;
            case R.id.but_minus:
                result = num1-num2; break;
            case R.id.but_multiply:
                result = num1*num2; break;
            case R.id.but_divide:
                result = (double)num1/num2; break;
        }

        textResult.setText("* 계산 결과 : "+result);
    }
}
