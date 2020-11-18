//
// Created by jacob on 11/18/20.
//

#include "Foo.h"

#include <iostream>

void Foo::bar()
{
    std::cout << "Callback in C++ (n == " << n << ")";
}

Foo::Foo(int n) : n(n)
{
}

Foo::~Foo()
{
}

void callback(Foo *foo)
{
    foo->bar();
}