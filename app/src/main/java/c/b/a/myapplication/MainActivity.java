package c.b.a.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override // onCreate 当前Actvity被创建的时候此方法会执行
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 加载了布局文件 R是用来存储APP资源的系统类(此自动生成无需修改)
        setContentView(R.layout.activity_main);
    }

    // view就是当前触发事件的对象,android中所有的可视化组件都是view的子类
    public void goURL(View view){
        // 1: 获取文本框里面的值
        EditText edtUrl = (EditText)this.findViewById(R.id.edt_url);
        String url = edtUrl.getText().toString();
        // 2: 调用系统提供浏览器访问网页(只要调用Activty则必须通过意图)
       // if(url.substring(0,4)=="http")
        Intent intent = new Intent();
        // Intent.ACTION_VIEW 系统中指定的浏览器actvity key
        intent.setAction(Intent.ACTION_VIEW);
        // 根据情况有些Actvity在调用的时候需要参数的.
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
