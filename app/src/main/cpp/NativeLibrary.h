#ifndef NATIVELIBRARY_H
#define NATIVELIBRARY_H

#include <string>

namespace NativeLibrary {
    class NativeClass {
    public:
        const std::string& get_property();
        void set_property(const std::string& property);
        std::string property;
    };
}

#endif // NATIVELIBRARY_H
