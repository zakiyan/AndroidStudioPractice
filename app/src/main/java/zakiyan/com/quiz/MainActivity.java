package zakiyan.com.quiz;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;


import java.util.Random;


public class MainActivity extends Activity implements View.OnClickListener {

    private Button button1;
    private Button button2;
    GeographyJapan geographyJapan;
    @Override
    public void onClick(View view) {
        showAlertDialog(view);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        quizData();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void showAlertDialog(View view){
        AlertDialog.Builder alertDialog=new AlertDialog.Builder(this);
        if(view == button1) {
            // ダイアログの設定
            alertDialog.setMessage("正解");  //内容(メッセージ)設定
        }
        if(view == button2) {
            // ダイアログの設定
            alertDialog.setMessage("不正解");  //内容(メッセージ)設定
        }
        // OK(肯定的な)ボタンの設定
        alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // OKボタン押下時の処理
//                Log.d("AlertDialog", "Positive which :" + which);
                quizData();
            }
        });
        alertDialog.show();
    }

    public void quizData(){

        geographyJapan = new GeographyJapan();

        QuizObject[] quizobjectarray = geographyJapan.quizObjectArray();


        TextView tv = new TextView(this);

//      maru:trueの時○ボタンを正解にする
//      maru:falseの時×ボタンを正解にする
//      ランダムで確率半々

        boolean maru = randamSeikai();

        String groupname ="";

        if (maru) {
            groupname = quizobjectarray[0].getGroupname();
        }else{
            groupname = geographyJapan.quizGroupName(quizobjectarray[0].getGroupname());
        }
        tv.setText(quizobjectarray[0].getObjectname() + "は"
                + groupname + "である");

/*        final int a = 47;


        TextView tv = new TextView(this);

        String[] kname = new String[2];

        boolean maru = randamSeikai();

        Region reg = new Region();
        Random random = new Random();
        kname = reg.getRegionName(random.nextInt(a));

        if (maru) {
            tv.setText(kname[0] + "は" + kname[1]+ "である");

        }else{
            String[] g = {"北海道地方",
                    "東北地方",
                    "関東地方",
                    "中部地方",
                    "関西地方",
                    "中国地方",
                    "四国地方",
                    "九州地方"};

            String ggname= g[random.nextInt(8)];

            while (kname[1] == ggname){
                ggname= g[random.nextInt(8)];
            }
            tv.setText(kname[0] + "は" + ggname + "である");
        }
*/
// ボタンを生成
        Button btn1 = new Button(this);
        btn1.setText("○");
        Button btn2 = new Button(this);
        btn2.setText("×");

// レイアウト作成
        LinearLayout layout = new LinearLayout(this);
        layout.addView(tv, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.addView(btn1, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        layout.addView(btn2, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));
        setContentView(layout);

        if(maru){
            button1 = btn1;
            button2 = btn2;
        }else{
            button1 = btn2;
            button2 = btn1;
        }
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    private boolean randamSeikai() {
        Random random = new Random();
        int ran = random.nextInt(2);
        switch (ran){
            case 0:
                return true;
        }
        return false;
    }
}
