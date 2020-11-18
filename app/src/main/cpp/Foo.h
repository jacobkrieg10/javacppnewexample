//
// Created by jacob on 11/18/20.
//

#ifndef MYJAVACPPAPP_FOO_H
#define MYJAVACPPAPP_FOO_H


class Foo {
public:
    int n;
    Foo(int n);
    virtual ~Foo();
    virtual void bar();
};

void callback(Foo *foo);

#endif //MYJAVACPPAPP_FOO_H
