package com.example.myjavacppapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pointer objects allocated in Java get deallocated once they become unreachable,
        // but C++ destructors can still be called in a timely fashion with Pointer.deallocate()
        NativeLibrary.NativeClass l = new NativeLibrary.NativeClass();
        l.set_property("Hello World!");
        System.out.println(l.get_property());

        VirtualFoo.Foo foo = new VirtualFoo.Foo(13);
        VirtualFoo.Foo foo2 = new VirtualFoo.Foo(42) {
            public void bar() {
                System.out.println("Callback in Java (n == " + n() + ")");
            }
        };
        foo.bar();
        foo2.bar();
        VirtualFoo.callback(foo);
        VirtualFoo.callback(foo2);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'native-lib' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}