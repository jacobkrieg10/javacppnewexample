package com.example.myjavacppapp;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

@Platform(include="Foo.h")
public class VirtualFoo {
    static { Loader.load(); }

    public static class Foo extends Pointer {
        static { Loader.load(); }
        public Foo(int n) { allocate(n); }
        private native void allocate(int n);

        @NoOffset
        public native int n();
        public native Foo n(int n);

        @Virtual
        public native void bar();
    }

    public static native void callback(Foo foo);
}