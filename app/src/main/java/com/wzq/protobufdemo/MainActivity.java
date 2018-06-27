package com.wzq.protobufdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.protobuf.ByteString;

import java.io.OutputStream;
import java.net.Socket;

import entity.SomeOuterClass;

public class MainActivity extends AppCompatActivity {
    private final String TAG = this.getClass().getSimpleName();
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        btnSend = findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            send();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }).start();
            }
        });
    }

    private void send() throws Exception {
        byte b[] = new byte[1];
        b[0] = 2;
        ByteString byteString = ByteString.copyFrom(b);

        SomeOuterClass.Some some = SomeOuterClass.Some.newBuilder()
                .setA(1)
                .setB(1L)
                .setC("hello")
                .setD(byteString)
                .build();

        Log.e(TAG, "length: " + some.toByteArray().length);

        Socket socket = new Socket("192.168.1.86", 11111);
        Log.e(TAG, "connect");
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(some.toByteArray());
        outputStream.flush();
        outputStream.close();
    }

}
